package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import javax.validation.Valid;

@RestController
public class UserController {
    private Map<Long, User> users = new HashMap<>();
    private final AtomicLong couter = new AtomicLong();

    @GetMapping("/users")
    @CrossOrigin
    public Collection<User> users(){
        return users.values();
    }


    @PostMapping("/users")
    @CrossOrigin
    public User create_user(@RequestBody @Valid User user) {
        long new_id = couter.incrementAndGet();
        user.setId(new_id);
        users.put(new_id, user);

        return user;
    }

    @GetMapping("/users/{id}")
    @CrossOrigin
    public User specific_user(@PathVariable(value = "id") Long id) {
        if(!users.containsKey(id))
            throw new UserNotFoundException(id);
        return users.get(id);
    }

    @DeleteMapping("/users/{id}")
    @CrossOrigin
    public String delete_user(@PathVariable(value = "id") Long id) {
        users.remove(id);
        return "L'utilisateur " + id + " a été supprimé";
    }

    @PutMapping("/users/{id}")
    @CrossOrigin
    public User modifyUserById(@PathVariable(value = "id")Long id, @Valid @RequestBody User user ) {
        if(!users.containsKey(id))
            throw new UserNotFoundException(id);

        User u = users.get(id);
        u.setFirstname(user.getFirstname());
        u.setLastname(user.getLastname());
        u.setAge(user.getAge());
        users.put(u.getId(), u);
        return u;
    }



}
