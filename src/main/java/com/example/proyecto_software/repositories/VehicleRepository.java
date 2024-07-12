package com.example.proyecto_software.repositories;

import com.example.proyecto_software.models.VehicleModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends CrudRepository<VehicleModel, Integer> {
}
