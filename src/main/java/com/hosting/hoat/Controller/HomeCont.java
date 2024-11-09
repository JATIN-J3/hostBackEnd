package com.hosting.hoat.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCont {

    User user = new User("jatin", "Jethwa", "9783118137", "jatinjethwaj3@gmail.com", "bhola sadan ganj");

    @GetMapping
    public String home() {
        return "Home controller";
    }

    @GetMapping("/profile")
    public User profile() {

        return user;
    }
}
