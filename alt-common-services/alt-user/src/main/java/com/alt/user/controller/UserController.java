package com.alt.user.controller;

import com.alt.user.domain.User;
import com.alt.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    private User registerUer(User user) {

        return userService.registerUser(user);
    }




}
