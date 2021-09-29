package com.example.Authentification;

import javax.validation.constraints.NotNull;

public class UserAuthentification {

    private long userId;
    private String password;

    @NotNull(message = "")

    public UserAuthentification(long userId, String password){
        this.userId = userId;
        this.password = password;
    }

    public long getUserId() { return userId; }
    public void setUserId(long userId) { this.userId = userId;}

    public String getPassword() { return password;}
    public void setPassword(String password) { this.password = password;}
}
