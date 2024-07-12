package com.example.proyecto_software.services;

import com.example.proyecto_software.models.DriverModel;
import com.example.proyecto_software.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DriverService {
    @Autowired
    DriverRepository driverRepository;

    public ArrayList<DriverModel> getDrivers() {
        return (ArrayList<DriverModel>) driverRepository.findAll();
    }

    public DriverModel createDriver(DriverModel driverModel) {
        return driverRepository.save(driverModel);
    }

    public DriverModel updateDriver(Integer id, DriverModel driverModel) {
        DriverModel existingDriver = driverRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Driver not found with id " + id));
        existingDriver.setName(driverModel.getName());
        existingDriver.setAddress(driverModel.getAddress());
        existingDriver.setPhone(driverModel.getPhone());
        existingDriver.setEmail_address(driverModel.getEmail_address());
        return driverRepository.save(existingDriver);
    }

    public boolean deleteDriver(Integer id) {
        this.driverRepository.deleteById(id);
        return true;
    }
}
