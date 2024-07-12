package com.example.proyecto_software.repositories;

import com.example.proyecto_software.models.CargoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends CrudRepository<CargoModel, Integer> {
}
