package com.geekster.instagram.controller;

import com.geekster.instagram.model.User;
import com.geekster.instagram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //sing up
    @PostMapping("user/signup")
    public String userSignUp(@RequestBody User user)
    {
        return userService.userSignUp(user);

    }

    @PostMapping("user/signIn")
    public String userSignIn(@RequestBody User newUser)
    {
        return userService.userSignIn(newUser);
    }

}
