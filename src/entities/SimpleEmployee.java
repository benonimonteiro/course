package entities;

public class SimpleEmployee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary *= 1.0 + (percentage / 100.0);
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", netSalary());
	}
}
