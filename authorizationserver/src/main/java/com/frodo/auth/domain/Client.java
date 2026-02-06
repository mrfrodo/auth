package com.frodo.auth.domain;


import java.util.Set;
import java.util.UUID;
import static com.frodo.auth.domain.util.SecretMasker.mask;

public record Client(
        UUID id,
        String clientId,
        Secret clientSecret,
        Set<String> scopes,
        Set<String> authorizedGrantTypes
) {
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", clientId='" + clientId + '\'' +
                ", clientSecret='" + mask(clientSecret.value()) + '\'' +
                ", scopes=" + scopes +
                ", authorizedGrantTypes=" + authorizedGrantTypes +
                '}';
    }
}
