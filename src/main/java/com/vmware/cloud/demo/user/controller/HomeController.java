package com.vmware.cloud.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.vmware.cloud.demo.user.service.UserService;

@Controller
public class HomeController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/")
    public String listUsers(Model model) {
        System.out.println("called");
        model.addAttribute("users", userService.getUsers());
        return "home";
    }

}
