package com.example.proyecto_software.repositories;

import com.example.proyecto_software.models.RouteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends CrudRepository<RouteModel,Integer> {
}
