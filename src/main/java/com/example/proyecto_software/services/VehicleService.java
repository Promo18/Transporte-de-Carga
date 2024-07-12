package com.example.proyecto_software.services;

import com.example.proyecto_software.models.VehicleModel;
import com.example.proyecto_software.models.VehicleModel;
import com.example.proyecto_software.repositories.DriverRepository;
import com.example.proyecto_software.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    public ArrayList<VehicleModel> GetVehicles() {
        return (ArrayList<VehicleModel>) vehicleRepository.findAll();
    }

    public VehicleModel createVehicle(VehicleModel vehicleModel) {
        return vehicleRepository.save(vehicleModel);
    }

    public VehicleModel updateVehicle(Integer id, VehicleModel vehicleModel) {
        VehicleModel existingVehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found with id " + id));
        existingVehicle.setLicence_plate(vehicleModel.getLicence_plate());
        existingVehicle.setModel(vehicleModel.getModel());
        existingVehicle.setYear(vehicleModel.getYear());
        existingVehicle.setLoad_capacity(vehicleModel.getLoad_capacity());
        return vehicleRepository.save(existingVehicle);
    }

    public boolean deleteVehicle(Integer id) {
        this.vehicleRepository.deleteById(id);
        return true;
    }
}
