package com.example.proyecto_software.controllers;

import com.example.proyecto_software.models.ClientModel;
import com.example.proyecto_software.models.ClientModel;
import com.example.proyecto_software.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientViewController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public ArrayList<ClientModel> getClients() {
        return clientService.GetClients();
    }

    @PostMapping
    public ResponseEntity<ClientModel> createClient(@RequestBody ClientModel clientModel) {
        return new ResponseEntity<>(this.clientService.createClient(clientModel), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClientModel> updateClient(@PathVariable("id") Integer id, @RequestBody ClientModel clientModel) {
        return new ResponseEntity<>(this.clientService.updateClient(id, clientModel), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable("id") Integer id) {
        this.clientService.deleteClient(id);
        return ResponseEntity.noContent().build();
    }


}
