package com.example.proyecto_software.services;

import com.example.proyecto_software.models.CargoModel;
import com.example.proyecto_software.models.CargoModel;
import com.example.proyecto_software.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CargoService {
    @Autowired
    CargoRepository cargoRepository;

    public ArrayList<CargoModel> getCargos() {
        return (ArrayList<CargoModel>) cargoRepository.findAll();
    }

    public CargoModel createCargo(CargoModel cargoModel) {
        return cargoRepository.save(cargoModel);
    }

    public CargoModel updateCargo(Integer id, CargoModel cargoModel) {
        CargoModel existingCargo = cargoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cargo not found with id " + id));
        existingCargo.setDescription(cargoModel.getDescription());
        existingCargo.setWeight(cargoModel.getWeight());
        existingCargo.setDimensions(cargoModel.getDimensions());
        existingCargo.setStatus(cargoModel.getStatus());
        return cargoRepository.save(existingCargo);
    }

    public boolean deleteCargo(Integer id) {
        this.cargoRepository.deleteById(id);
        return true;
    }

}
