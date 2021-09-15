package com.example.demo;

public class UserNotFoundException extends RuntimeException{
    UserNotFoundException(Long id) {
        super("L'utilisateur "+id+" n'est pas trouvé");
    }
}
