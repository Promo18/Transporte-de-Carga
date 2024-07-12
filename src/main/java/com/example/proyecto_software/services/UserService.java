package com.example.proyecto_software.services;

import com.example.proyecto_software.models.UserModel;
import com.example.proyecto_software.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserModel createUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public UserModel getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
