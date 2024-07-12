package com.example.proyecto_software.models;

import jakarta.persistence.*;


@Table(name = "route")
@Entity
public class RouteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String origin;
    private String destination;
    private double distance;
    private double basic_tariff;
    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getBasic_tariff() {
        return basic_tariff;
    }

    public void setBasic_tariff(double basic_tariff) {
        this.basic_tariff = basic_tariff;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
