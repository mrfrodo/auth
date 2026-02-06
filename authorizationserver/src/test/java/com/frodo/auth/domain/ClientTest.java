package com.frodo.auth.domain;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Represents an OAuth2 Client in the authentication system.
 *
 * <p>
 * A Client is an application that can request access tokens from the
 * Authorization Server. It has a unique identifier, a secret, allowed
 * scopes, and authorized grant types. This class is immutable and
 * belongs to the domain layer.
 * </p>
 *
 * <p>
 * Example usage:
 * <pre>{@code
 * Client client = new Client(
 *     UUID.randomUUID(),
 *     "my-client",
 *     "secret",
 *     Set.of("read", "write"),
 *     Set.of("password", "refresh_token")
 * );
 * }</pre>
 * </p>
 */

class ClientTest {

    @Test
    void testClientCreationAndGetters() {
        // Arrange
        UUID id = UUID.randomUUID();
        String clientId = "my-client";
        Secret clientSecret = new Secret("secret");
        Set<String> scopes = Set.of("read", "write");
        Set<String> grantTypes = Set.of("password", "refresh_token");

        // Act
        Client client = new Client(id, clientId, clientSecret, scopes, grantTypes);

        System.out.println(client);
        // Assert
        assertEquals(id, client.id());
        assertEquals(clientId, client.clientId());
        assertEquals(clientSecret, client.clientSecret());
        assertEquals(scopes, client.scopes());
        assertEquals(grantTypes, client.authorizedGrantTypes());
    }
}
