package com.example.proyecto_software.controllers;

import com.example.proyecto_software.models.VehicleModel;
import com.example.proyecto_software.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vehicles")
@Validated
public class VehicleViewController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ArrayList<VehicleModel> getVehicles() {
        return vehicleService.GetVehicles();
    }

    @PostMapping
    public ResponseEntity<VehicleModel> createVehicle(@RequestBody VehicleModel vehicleModel) {
        return ResponseEntity.ok(this.vehicleService.createVehicle(vehicleModel));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VehicleModel> updateVehicle(@PathVariable("id") Integer id, @RequestBody VehicleModel vehicleModel) {
        return ResponseEntity.ok(this.vehicleService.updateVehicle(id, vehicleModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable("id") Integer id) {
        this.vehicleService.deleteVehicle(id);
        return ResponseEntity.noContent().build();
    }


}
