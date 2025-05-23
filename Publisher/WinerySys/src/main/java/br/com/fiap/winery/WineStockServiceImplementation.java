package br.com.fiap.winery;


import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService{


    @Override
    public String getMenu() {
        return """
        Lista de Vinhos Disponíveis:
        - Vinho: Cabernet Reserva | Uva: Cabernet Sauvignon
        - Vinho: Chardonnay Elegance | Uva: Chardonnay
        - Vinho: Merlot Premium | Uva: Merlot
        - Vinho: Syrah Clássico | Uva: Syrah
        - Vinho: Pinot Noir Suave | Uva: Pinot Noir
        """;
    }


    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}
