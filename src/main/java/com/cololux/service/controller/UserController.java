package com.cololux.service.controller;


import com.cololux.service.entity.User;
import com.cololux.service.respository.UserRepository;
import com.cololux.service.service.impl.AuthenticationServiceImpl;
import com.cololux.service.service.impl.UserServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@Log4j2
@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationServiceImpl authenticationService;

    @GetMapping("/get/user")
    public List<User> getUser() {
        return userRepository.findAll();
    }


}
