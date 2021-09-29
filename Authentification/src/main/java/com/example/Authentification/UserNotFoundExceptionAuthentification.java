package com.example.Authentification;

public class UserNotFoundExceptionAuthentification extends RuntimeException{
    UserNotFoundExceptionAuthentification(Long userId) { super("L'utilisateur "+ userId +" n'est pas trouvé"); }
}
