package application;

import java.util.Arrays;
import java.util.List;

public class Program42 {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(5, 2, 10);
		printList(ints);
		
		List<String> strs = Arrays.asList("Maria", "Alex", "Bob");
		printList(strs);
		
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
