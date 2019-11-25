package entities;

public class ConcretePrinter extends Device implements Printer {

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.printf("Printer processDoc: %s%n%s%n", getSerialNumber(), doc);
	}
	
	public String print(String doc) {
		return "Printer print: " + doc;
	}
}
