package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthExpenditures = healthSpending;
	}

	public Double getHealthSpending() {
		return healthExpenditures;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthExpenditures = healthSpending;
	}

	@Override
	public double calculateTax() {
		double tax = 0.0;
		
		if (getAnnualIncome() < 20000.00) {
			tax = 0.15;
		}
		else {
			tax = 0.25;
		}
		
		return getAnnualIncome() * tax - (healthExpenditures * 0.5);
	}
}
