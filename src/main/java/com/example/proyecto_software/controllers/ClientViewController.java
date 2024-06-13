package com.example.proyecto_software.controllers;

import com.example.proyecto_software.models.ClientModel;
import com.example.proyecto_software.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("view/clients")
public class ClientViewController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public String renderClients(Model model) {
        List<ClientModel> clients = clientService.GetClients();
        model.addAttribute("clients", clients);
        return "clients";
    }
}
