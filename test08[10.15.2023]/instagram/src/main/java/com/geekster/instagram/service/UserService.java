package com.geekster.instagram.service;

import com.geekster.instagram.model.User;
import com.geekster.instagram.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;


    public String userSignUp(User user) {
        userRepo.save(user);
        return "user added";
    }

    public String userSignIn(User newUser) {
        userRepo.save(newUser);
        return "user signIn";
    }
}
