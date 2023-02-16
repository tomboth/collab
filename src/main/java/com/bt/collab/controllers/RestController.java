package com.bt.collab.controllers;

import com.bt.collab.models.User;
import com.bt.collab.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    UserService userService;

    public RestController(UserService userService) {
        this.userService = userService;
    }


}
