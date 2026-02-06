package com.frodo.auth.domain.util;

public final class SecretMasker {

    private SecretMasker() {
        // prevent instantiation
    }

    /**
     * Masks a secret so it can be safely logged.
     * Example: "superSecret" -> "***erS***"
     */
    public static String mask(String secret) {
        if (secret == null || secret.length() <= 3) {
            return "***";
        }

        int mid = secret.length() / 2;
        int start = Math.max(0, mid - 1);
        int end = Math.min(secret.length(), mid + 2);

        return "***" + secret.substring(start, end) + "***";
    }
}
