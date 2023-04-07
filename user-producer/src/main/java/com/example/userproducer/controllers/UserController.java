package com.example.userproducer.controllers;

import com.example.userproducer.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produce")

public class UserController {

    @GetMapping("getUser")
    public User getUser() {
        User u = new User();
        u.setId(1);
        u.setName("Maaike");
        return u;
    }
}
