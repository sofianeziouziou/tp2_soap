package org.example.serveur;

import jakarta.xml.ws.Endpoint;
import org.example.service.Calculatrice;

public class ServeurCalculatrice {
    public static void main(String[] args) {
        String url = "http://localhost:8080/ws/calculatrice";
        Endpoint.publish(url, new Calculatrice());
        System.out.println("✅ Service Calculatrice publié sur : " + url + "?wsdl");
    }
}
