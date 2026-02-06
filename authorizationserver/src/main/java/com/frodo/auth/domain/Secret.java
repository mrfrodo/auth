package com.frodo.auth.domain;

import com.frodo.auth.domain.util.SecretMasker;

public record Secret(String value) {
    public Secret {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException("secret cannot be blank");
    }

    @Override
    public String toString() {
        return SecretMasker.mask(value);
    }
}