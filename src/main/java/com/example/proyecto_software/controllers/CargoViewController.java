package com.example.proyecto_software.controllers;

import com.example.proyecto_software.models.CargoModel;
import com.example.proyecto_software.models.ClientModel;
import com.example.proyecto_software.services.CargoService;
import com.example.proyecto_software.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoViewController {
    @Autowired
    private CargoService cargoService;

    @GetMapping
    public ArrayList<CargoModel> getCargos() {
        return cargoService.getCargos();
    }

    @PostMapping
    public ResponseEntity<CargoModel> createCargo(@RequestBody CargoModel cargoModel) {
        return ResponseEntity.ok(this.cargoService.createCargo(cargoModel));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CargoModel> updateCargo(@PathVariable("id") Integer id, @RequestBody CargoModel cargoModel) {
        return ResponseEntity.ok(this.cargoService.updateCargo(id, cargoModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCargo(@PathVariable("id") Integer id) {
        this.cargoService.deleteCargo(id);
        return ResponseEntity.noContent().build();
    }
}
