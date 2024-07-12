package com.example.proyecto_software.models;

import jakarta.persistence.*;

import javax.validation.constraints.Positive;

@Entity
@Table(name = "vehicle")
public class VehicleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String licence_plate;
    private String model;
    private Integer year;
    @Positive
    private Double load_capacity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicence_plate() {
        return licence_plate;
    }

    public void setLicence_plate(String licence_plate) {
        this.licence_plate = licence_plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getLoad_capacity() {
        return load_capacity;
    }

    public void setLoad_capacity(Double load_capacity) {
        this.load_capacity = load_capacity;
    }
}
