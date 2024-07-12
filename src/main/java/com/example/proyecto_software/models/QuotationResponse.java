package com.example.proyecto_software.models;

public class QuotationResponse {
    private double quotation;
    private String time;

    public QuotationResponse(double quotation, String time) {
        this.quotation = quotation;
        this.time = time;
    }

    public double getQuotation() {
        return quotation;
    }

    public void setQuotation(double quotation) {
        this.quotation = quotation;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
