package com.hosting.hoat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class HomeCont {

    @Autowired
    private UserService userService;

    @GetMapping
    public String home() {
        return "Home controller";
    }

    @GetMapping("/profile/{id}")
    public User profile(@PathVariable int id) {
        User user = userService.getById(id);
        return user;
    }

    @PostMapping("/create")
    public String create(@RequestBody User user) {
        User u = userService.createUser(user);
        return "User Created Succesfully";
    }

    @GetMapping("/all")
    public List<User> getAllUser() {
        List<User> all = userService.getAll();
        return all;
    }
}
