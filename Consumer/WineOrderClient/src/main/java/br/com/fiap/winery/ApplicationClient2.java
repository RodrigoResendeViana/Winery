package br.com.fiap.winery;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) {
        URL url = null;
        URL url2 = null;
        try {
            url = new URL("http://localhost:8080/menu?wsdl");
            url2 = new URL("http://localhost:8086/wine-warning-service?wsdl");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        QName qName2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");

        Service service = Service.create(url, qName);
        Service service2 = Service.create(url2, qName2);

        WineStockService wineStockService = service.getPort(WineStockService.class);
        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);

        String order = wineStockService.placeOrder("Pinot Noir Suave", 3);
        System.out.println("Order: " + order);

        String warn = wineWarningService.sendWarn();
        System.out.println("Resposta do serviço de aviso: " + warn);

    }
}