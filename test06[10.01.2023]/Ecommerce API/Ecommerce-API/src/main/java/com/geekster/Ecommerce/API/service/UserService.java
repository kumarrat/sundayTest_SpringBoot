package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.Address;
import com.geekster.Ecommerce.API.model.User;
import com.geekster.Ecommerce.API.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String saveUser(User newUser) {
        userRepo.save(newUser);
        return "user added";
    }

}
