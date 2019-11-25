package entities;

import java.util.Date;

public class HourContract {

	private Date moment;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {		
	}
	
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.moment = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return moment;
	}

	public void setDate(Date date) {
		this.moment = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
}
