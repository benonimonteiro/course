package entities;

public class Employee implements Comparable<Employee> {

	private Integer id;
	private String name;
	private String email;
	private Double salary;
	
	public Employee() {		
	}
	
	public Employee(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return id
				+ ", "
				+ name
				+ ", "
				+ String.format("%.2f", salary);
	}
	
	public void increaseSalary(double percentage) {
		salary *= (1 + percentage / 100);
	}

	@Override
	public int compareTo(Employee other) {
		return name.compareTo(other.getName());
//		return salary.compareTo(other.getSalary());
//		return -salary.compareTo(other.getSalary());
	}
}
