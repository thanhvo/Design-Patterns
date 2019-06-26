package general;

public class Car {
	private String model;
	private String make;
	private int year;
	private int milleage;
	private int VIN;
	
	public Car(Car c) {
		this.model = c.model;
		this.make = c.make;
		this.year = c.year;
		this.milleage = c.milleage;
		this.VIN = VIN;
	}
	
	public Car clone() {
		return new Car(this);
	}
}
