package com.frodo.auth.application;

import com.frodo.auth.domain.port.JwtService;
import com.frodo.auth.domain.User;

public class AuthorizationUseCase {

    private final JwtService jwtService;

    public AuthorizationUseCase(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    public String issueToken(User user) {
        return jwtService.generateToken(user);
    }
}
