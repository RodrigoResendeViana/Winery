package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args){

        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();
        System.out.println("Publicando webservices");
        Endpoint.publish("http://localhost:8080/menu", wineStock);
        Endpoint.publish("http://localhost:8086/wine-warning-service", wineWarning);
        System.out.println("Serviço publicado!");

    }
}
