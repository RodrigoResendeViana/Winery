package br.com.fiap.winery;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WinerySysApplicationTests {

	public static void main(String[] args) {
		WineStockServiceImplementation wine = new WineStockServiceImplementation();
		wine.getMenu();
		System.out.println(wine.getMenu());
	}

}
