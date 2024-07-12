package com.example.proyecto_software.models;

public class QuotationRequest {
    private int route_id;
    private double weight;
    private String shipment_type;

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getShipment_type() {
        return shipment_type;
    }

    public void setShipment_type(String shipment_type) {
        this.shipment_type = shipment_type;
    }
}
