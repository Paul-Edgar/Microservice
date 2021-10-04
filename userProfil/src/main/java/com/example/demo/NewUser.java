package com.example.demo;

import javax.validation.constraints.NotNull;
import java.sql.Struct;

public class NewUser {

    @NotNull(message ="Id required")
    private long id;

    @NotNull(message ="Pswd required")
    private String password;

    public NewUser(long id, String password){
        this.id = id;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
