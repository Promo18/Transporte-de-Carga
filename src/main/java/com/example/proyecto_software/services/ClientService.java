package com.example.proyecto_software.services;

import com.example.proyecto_software.models.ClientModel;

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


    public ClientModel createClient(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    public ClientModel updateClient(Integer id, ClientModel clientModel) {
        ClientModel existingClient = clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found with id " + id));
        existingClient.setName(clientModel.getName());
        existingClient.setAddress(clientModel.getAddress());
        existingClient.setPhone(clientModel.getPhone());
        existingClient.setEmail_address(clientModel.getEmail_address());
        return clientRepository.save(existingClient);
    }

    public boolean deleteClient(Integer id) {
        this.clientRepository.deleteById(id);
        return true;
    }


}

