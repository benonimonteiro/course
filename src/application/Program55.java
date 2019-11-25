package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductConsumer;

public class Program55 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("HD Case", 80.9));
		
		//list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		list.forEach(new ProductConsumer());

		list.forEach(p -> System.out.println(p.priceTag()));		
	}
}
