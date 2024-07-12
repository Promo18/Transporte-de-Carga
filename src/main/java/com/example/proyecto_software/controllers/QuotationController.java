package com.example.proyecto_software.controllers;

import com.example.proyecto_software.models.QuotationRequest;
import com.example.proyecto_software.models.QuotationResponse;
import com.example.proyecto_software.services.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotationController {
    @Autowired
    private QuotationService quotationService;

    @PostMapping("/quotation")
    public QuotationResponse calculateQuotation(@RequestBody QuotationRequest request) {
        return quotationService.calculateQuotation(request);
    }
}
