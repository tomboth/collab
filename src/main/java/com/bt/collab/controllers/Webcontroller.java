package com.bt.collab.controllers;

import com.bt.collab.models.Message;
import com.bt.collab.models.User;
import com.bt.collab.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Webcontroller {

    UserService userService;

    public Webcontroller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String renderIndex(){
        return "index.html";
    }

    @GetMapping("/register")
    public String renderRegister() {
        return "register.html";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user){
        userService.saveUser(user);
        return "index.html";
    }

    @PostMapping("/room")
    public String saveComment(@ModelAttribute Message message){
        userService.saveMessage(message);
        return "redirect:/room";
    }

    @GetMapping("/room")
    public String renderRoom(Model model){
        model.addAttribute("messages", userService.findMessages());
        return "room.html";
    }

    @PostMapping("/access")
    public String enter(){
        return "redirect:/room";
    }
}
