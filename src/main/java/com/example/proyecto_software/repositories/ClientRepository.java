package com.example.proyecto_software.repositories;

import com.example.proyecto_software.models.ClientModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientModel, Integer> {

}
