package com.frodo.auth.domain;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    @Test
    void testUserCreationAndGetters() {
        // Arrange
        UUID id = UUID.randomUUID();
        String username = "frodo";
        Secret password = new Secret("secret");
        String role = "RINGBEARER";


        // Act
        User user = new User(id, username, password, role);

        System.out.println(user);
        // Assert
        assertEquals(id, user.id());
        assertEquals(username, user.username());
        assertEquals(password, user.password());
        assertEquals(role, user.role());

    }
}
