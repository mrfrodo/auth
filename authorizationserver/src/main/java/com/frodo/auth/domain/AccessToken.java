package com.frodo.auth.domain;

import org.springframework.security.oauth2.core.OAuth2AccessToken;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

/**
 * Represents an OAuth2 Access Token in the domain.
 * Immutable value object.
 */
public record AccessToken(
        UUID id,
        UUID userId,
        UUID clientId,
        Set<String> scopes,
        Instant issuedAt,
        Instant expiresAt,
        String tokenValue,
        OAuth2AccessToken.TokenType tokenType   // BEARER or OPAQUE
) {
    public AccessToken {
        if (id == null) throw new IllegalArgumentException("id cannot be null");
        if (userId == null) throw new IllegalArgumentException("userId cannot be null");
        if (clientId == null) throw new IllegalArgumentException("clientId cannot be null");
        if (scopes == null || scopes.isEmpty())
            throw new IllegalArgumentException("scopes cannot be empty");
        if (issuedAt == null) throw new IllegalArgumentException("issuedAt cannot be null");
        if (expiresAt == null) throw new IllegalArgumentException("expiresAt cannot be null");
        if (tokenValue == null || tokenValue.isBlank())
            throw new IllegalArgumentException("tokenValue cannot be blank");
    }

    public boolean isExpired() {
        return Instant.now().isAfter(expiresAt);
    }
}