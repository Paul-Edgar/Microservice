package com.example.Authentification;

public class TokenNotValidException extends Throwable {
    public TokenNotValidException(String token) {
        super("Token invalid");
    }
}
