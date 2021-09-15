package com.example.demo;

import javax.validation.constraints.NotNull;

public class User {

    private long id;
    private String first_name;
    private String last_name;
    private int age;

    @NotNull(message = "")


    public User(long id, String first_name, String last_name, int age){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    /* initialisation ID */
    public long getId(){ return id; }

    /* initialisation first_name */
    public String getFirst_name(){ return first_name; }
    public void setFirst_name(String first_name){ this.first_name = first_name; }

    /* initialisation last_name */
    public String getLast_name(){ return last_name; }
    public void setLast_name(String last_name){ this.last_name = last_name; }

    /* initialisation Age */
    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public void setId(long id){
        this.id = id;
    }
}
