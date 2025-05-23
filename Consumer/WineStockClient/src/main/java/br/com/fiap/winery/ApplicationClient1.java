package br.com.fiap.winery;

import jakarta.xml.ws.Service;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.*;

public class ApplicationClient1 {
    public static void main(String[] args) {
        try {

            // 1. URL do WSDL
            URL url = new URL("http://localhost:8080/menu?wsdl");

            // 2. QName com targetNamespace e nome do serviço
            QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");

            // 3. Criando o serviço
            Service service = Service.create(url, qName);

            // 4. Obtendo a interface do serviço (porta)
            WineStockService wineStockService = service.getPort(WineStockService.class);

            // 5. Chamando o método e imprimindo resultado
            String menu = wineStockService.getMenu();
            System.out.println("Menu: " + menu);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
