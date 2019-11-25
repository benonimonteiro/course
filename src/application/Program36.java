package application;

import entities.ComboDevice;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class Program36 {

	public static void main(String[] args) {

		ConcretePrinter printer = new ConcretePrinter("1080");
		printer.processDoc(printer.print("My Documment"));
		
		System.out.println();
		ConcreteScanner scanner = new ConcreteScanner("2003");
		scanner.processDoc(scanner.scan("My Photography"));
		
		System.out.println();
		ComboDevice comboDevice = new ComboDevice("2081");
		comboDevice.processDoc(comboDevice.print("My E-mail"));
		comboDevice.processDoc(comboDevice.scan("My Image"));
	}
}
