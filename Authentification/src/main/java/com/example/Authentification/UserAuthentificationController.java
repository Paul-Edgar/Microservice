package com.example.Authentification;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import javax.validation.Valid;

@RestController
public class UserAuthentificationController {
    private Map<Long, UserAuthentification> users = new HashMap<>();
    private Map<String, Token> tokens = new HashMap<>();
    private final AtomicLong couter = new AtomicLong();

    @PostMapping("/users")
    @CrossOrigin
    public long create_user(@RequestBody @Valid UserAuthentification user) {
        long new_id = user.getUserId();
        users.put(new_id, user);

        return new_id;
    }

    @GetMapping("/users")
    @CrossOrigin
    public Collection<UserAuthentification> users(){
        return users.values();
    }

    @GetMapping("/users/{userId}")
    @CrossOrigin
    public UserAuthentification specific_user(@PathVariable(value = "userId") Long userId) {
        if(!users.containsKey(userId))
            throw new UserNotFoundExceptionAuthentification(userId);
        return users.get(userId);
    }

    @DeleteMapping("/users/{userId}")
    @CrossOrigin
    public String delete_user(@PathVariable(value = "userId") Long userId) {
        users.remove(userId);
        return "L'utilisateur " + userId + " a été supprimé";
    }

    @PostMapping("/users/{userId}/password")
    public String update_password(@PathVariable(value = "userId") Long userId, @RequestBody String newPassword) {
        UserAuthentification user = users.get(userId);
        user.setPassword(newPassword);
        return "Le password du " + userId + " a été modifié";
    }

    // Opérations token

    @GetMapping("/token")
    public long getToken(@RequestHeader(value = "X-Token") String token) throws TokenNotValidException {
        if (!tokens.containsKey(token))
            throw new TokenNotValidException(token);
        Token t = tokens.get(token);
        if(!t.isValid(token))
            throw new TokenNotValidException(token);
        return t.getUserId();
    }

    @PostMapping("/users/{id}/token")
    public String login(@PathVariable(value = "id")Long id, @RequestBody String password) throws UserNotFoundExceptionAuthentification, PasswordIncorrectException {
        if (!users.containsKey(id))
            throw new UserNotFoundExceptionAuthentification(id);
        if (!users.get(id).checkPassword(password))
            throw new PasswordIncorrectException();

        Token token = new Token(id);
        this.tokens.put(token.getToken(), token);

        return token.getToken();
    }

    @DeleteMapping("/users/{id}/token")
    public void logout(@PathVariable(value = "id") Long id,
                       @RequestHeader(value = "X-Token") String token) throws TokenNotValidException, UserNotFoundExceptionAuthentification {
        if (!users.containsKey(id))
            throw new UserNotFoundExceptionAuthentification(id);
        if (!tokens.containsKey(token))
            throw new TokenNotValidException(token);
        Token t = tokens.get(token);
        if (t.getUserId() != id)
            throw new TokenNotValidException(token);
        if (!t.isValid(token)){
            throw new TokenNotValidException(token);
        }
        this.tokens.remove(token);
    }

}
