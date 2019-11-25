package entities;

public class Student {
	
	public String name;
	public double[] grades = new double[3];
	
	public double getFinalGrade() {
		double sum = 0;
		
		for (int i=0; i<grades.length; i++) {
			sum += grades[i];
		}
		
		return sum;
	}
	
	public String getResult() {
		if (getFinalGrade() >= 60) {
			return "PASS";
		}
		else {
			return "FAILED (MISSING " 
					+ String.format("%.2f", (60 - getFinalGrade())) 
					+ " POINTS)";
		}
	}
	
	public String toString() {
		return name;
	}
}
