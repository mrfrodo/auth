package com.frodo.auth.domain;

import java.util.UUID;
import static com.frodo.auth.domain.util.SecretMasker.mask;

public record User(
        UUID id,
        String username,
        Secret password,
        String role
) {
    // Optional: validation / normalization
    public User {
        if (id == null) throw new IllegalArgumentException("id cannot be null");
        if (username == null || username.isBlank())
            throw new IllegalArgumentException("username cannot be blank");
        if (role == null || role.isBlank())
            throw new IllegalArgumentException("role cannot be blank");
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + mask(password.value()) + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
