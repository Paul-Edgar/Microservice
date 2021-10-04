package com.example.Authentification;

public class PasswordIncorrectException extends Throwable {
    public PasswordIncorrectException() {
        super("Password invalid");
    }
}
