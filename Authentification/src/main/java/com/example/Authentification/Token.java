package com.example.Authentification;

import org.apache.logging.log4j.util.Chars;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Random;

public class Token {

    private String token;
    private long userId;
    private LocalDateTime timeLimit;

    final char[] allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    private String generateToken() {
        Random random = new SecureRandom();
        StringBuilder token = new StringBuilder();

        for (int i=0; i<10; i++){
            token.append(allowedChars[random.nextInt(allowedChars.length)]);
        }
        return token.toString();
    }
    
    public Token(long userId) {
        this.token = token;
        this.userId = userId;
        this.timeLimit = timeLimit;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    public long getUserId() {
        return userId;
    }
    
    public void setUserId(long userId) {
        this.userId = userId;
    }
    
    public LocalDateTime getTimeLimit() {
        return timeLimit;
    }
    
    public void setTimeLimit(LocalDateTime timeLimit) {
        this.timeLimit = timeLimit;
    }
}
