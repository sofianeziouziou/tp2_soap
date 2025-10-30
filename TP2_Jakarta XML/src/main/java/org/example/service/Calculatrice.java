package org.example.service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "org.example.service.ICalculatrice")
public class Calculatrice implements ICalculatrice {

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double soustraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Division par zéro interdite !");
        return a / b;
    }
}
