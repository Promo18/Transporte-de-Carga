package com.example.proyecto_software.services;

import com.example.proyecto_software.models.QuotationRequest;
import com.example.proyecto_software.models.QuotationResponse;
import com.example.proyecto_software.models.RouteModel;
import com.example.proyecto_software.repositories.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class QuotationService {
    @Autowired
    private RouteRepository routeRepository;

    @NotNull
    public QuotationResponse calculateQuotation(QuotationRequest request) {
        RouteModel route = routeRepository.
                findById(request.getRoute_id()).orElseThrow(() -> new RuntimeException("Route not found with id " + request.getRoute_id()));
        double basicTariff = route.getBasic_tariff();
        double weightRate = request.getWeight() * 1.5;
        double typeShipmentTariff = "express".equals(request.getShipment_type()) ? 10.0 : 0.0;
        double total = basicTariff + weightRate + typeShipmentTariff;

        return new QuotationResponse(total, route.getTime());
    }
}
