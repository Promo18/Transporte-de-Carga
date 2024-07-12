package com.example.proyecto_software.repositories;

import com.example.proyecto_software.models.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
    UserModel findByUsername(String username);
}
