package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.Address;
import com.geekster.Ecommerce.API.model.User;
import com.geekster.Ecommerce.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser(@RequestBody User newUser)
    {
        return userService.saveUser(newUser);
    }

}
