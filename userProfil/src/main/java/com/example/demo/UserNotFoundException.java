package com.example.demo;

public class UserNotFoundException extends RuntimeException{
    UserNotFoundException(Long id) {
        super("L'utilisateur n'est pas trouvé" + id);
    }
}
