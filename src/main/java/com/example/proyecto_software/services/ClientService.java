package com.example.proyecto_software.services;

import com.example.proyecto_software.models.ClientModel;
import com.example.proyecto_software.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public ArrayList<ClientModel> GetClients() {
        return (ArrayList<ClientModel>) clientRepository.findAll();
    }
}
