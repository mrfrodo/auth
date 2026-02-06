package com.frodo.auth.domain.port;

import com.frodo.auth.domain.User;

public interface JwtService {
    String generateToken(User user);
    String validateToken(String token);
}