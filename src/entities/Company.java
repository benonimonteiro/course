package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;
	
	public Company() {		
	}
	
	public Company(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.numberOfEmployees = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return numberOfEmployees;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.numberOfEmployees = employeeNumber;
	}

	@Override
	public double calculateTax() {
		double tax = 0.0;
		
		if (numberOfEmployees <= 10) {
			tax = 0.16;
		} 
		else {
			tax = 0.14;
		}
		
		return getAnnualIncome() * tax;
	}
}
