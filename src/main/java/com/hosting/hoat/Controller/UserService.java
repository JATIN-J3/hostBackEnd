package com.hosting.hoat.Controller;

import java.util.Optional;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User getById(int id) {
        Optional<User> user = userRepo.findById(id);
        return user.get();
    }

    public User createUser(User user) {
        userRepo.save(user);
        return user;
    }

    public List<User> getAll() {
        List<User> all = userRepo.findAll();
        return all;
    }
}
