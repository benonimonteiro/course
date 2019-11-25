package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program54 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("HD Case", 80.9));
		
		//list.removeIf(x -> x.getPrice() >= 100);
		list.removeIf(new ProductPredicate());
		
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
	}
}