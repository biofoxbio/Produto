package entities;

public class Employee {

	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	
	public Employee() {
		
	}
	
	public Employee(String name, double hours2, Double valuePerHour) {
	
		this.name = name;
		this.hours = (int) hours2;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public double payment() {
		return hours * valuePerHour;
	}
}
