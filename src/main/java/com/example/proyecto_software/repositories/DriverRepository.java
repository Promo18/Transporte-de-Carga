package com.example.proyecto_software.repositories;

import com.example.proyecto_software.models.DriverModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<DriverModel, Integer> {
}
