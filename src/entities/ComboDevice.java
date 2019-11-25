package entities;

public class ComboDevice extends Device implements Printer, Scanner {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.printf("ComboDevice processDoc: %s%n%s%n", getSerialNumber(), doc);
	}

	@Override
	public String print(String doc) {
		return "ComboDevice print: " + doc;
	}
	
	@Override
	public String scan(String doc) {
		return "ComboDevice scan: " + doc;	
	}
}
