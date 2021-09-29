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
    private final AtomicLong couter = new AtomicLong();

    @GetMapping("/users")
    @CrossOrigin
    public Collection<UserAuthentification> users(){
        return users.values();
    }

    @PostMapping("/users")
    @CrossOrigin
    public UserAuthentification create_user(@RequestBody @Valid UserAuthentification user) {
        long new_id = couter.incrementAndGet();
        user.setUserId(new_id);
        users.put(new_id, user);

        return user;
    }

    @GetMapping("/users/{userId}")
    @CrossOrigin
    public UserAuthentification specific_user(@PathVariable(value = "userId") Long userId) {
        if(!users.containsKey(userId))
            throw new UserNotFoundExceptionAuthentification(userId);
        return users.get(userId);
    }
}
