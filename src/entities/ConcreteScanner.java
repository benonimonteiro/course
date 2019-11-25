package entities;

public class ConcreteScanner extends Device implements Scanner {

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.printf("Scanner processDoc: %s%n%s%n", getSerialNumber(), doc);
	}
	
	public String scan(String doc) {
		return "Scanner scan: " + doc;
	}
}
