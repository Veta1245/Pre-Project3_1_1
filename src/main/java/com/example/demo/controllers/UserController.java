package com.example.demo.controllers;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired()
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String users(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "usersList";
    }


    @GetMapping("/new")
    public String newUserWindow(@RequestParam(value = "id", required = false) Long id, Model model) {
        User user;
        if (id != null) {
            user = userService.getUserById(id);
        } else {
            user = new User();
        }
        model.addAttribute("user", user);
        return "createUser";
    }

    @PostMapping("/new")
    public String newUser(@ModelAttribute("user") User user) {

        userService.updateUser(user);
        return "redirect:/";

    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        userService.removeUser(id);
        return "redirect:/";
    }
}
