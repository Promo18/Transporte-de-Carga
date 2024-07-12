package com.example.proyecto_software.controllers;

import com.example.proyecto_software.models.DriverModel;
import com.example.proyecto_software.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverViewController {
    @Autowired
    private DriverService driverService;

    @GetMapping
    public ArrayList<DriverModel> getDrivers() {
        return driverService.getDrivers();
    }

    @PostMapping
    public DriverModel createDriver(@RequestBody DriverModel driverModel) {
        return driverService.createDriver(driverModel);
    }

    @PutMapping("/{id}")
    public DriverModel updateDriver(@PathVariable("id") Integer id, @RequestBody DriverModel driverModel) {
        return driverService.updateDriver(id, driverModel);
    }

    @DeleteMapping("/{id}")
    public boolean deleteDriver(@PathVariable("id") Integer id) {
        return driverService.deleteDriver(id);
    }
}
