package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.ProductFunction;

public class Program56 {

	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("HD Case", 80.9));
		
		//List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		List<String> names = list.stream().map(new ProductFunction()).collect(Collectors.toList());

		names.forEach(System.out::println);
	}
}
