package com.example.proyecto_software.controllers;

import com.example.proyecto_software.models.UserModel;
import com.example.proyecto_software.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserModel> registerUser(@RequestBody UserModel userModel) {
        return ResponseEntity.ok(userService.createUser(userModel));
    }

    @PostMapping("/login")
    public ResponseEntity<UserModel> loginUser(@RequestBody UserModel login) {
        UserModel user = userService.getUserByUsername(login.getUsername());
        if (user != null && user.getPassword().equals(login.getPassword())) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(401).build();
        }
    }

}
