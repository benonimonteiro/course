package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program44 {

	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(1, 2, 3, 4);
		List<Double> doubs = Arrays.asList(3.14, 6.28);
		List<Object> objs = new ArrayList<>();
		
		copy(ints, objs);
		printList(objs);
		
		System.out.println();
		
		copy(doubs, objs);
		printList(objs);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
	}
}
