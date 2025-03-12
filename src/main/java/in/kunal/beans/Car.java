package in.kunal.beans;

public class Car {

	private Engine engine;

	public void setEngine(Engine engine) {
		System.out.println("Setter()::Method Executed !!");
		this.engine = engine;
	}

	public Car(Engine engine) {
		System.out.println("Car Param Constructor!!");
		this.engine = engine;
	}

	public Car() {
		System.out.println("Car 0-Param Constructor!!");
	}

	public void drive() {
		int start = engine.start();
		if (start >= 1) {
			System.out.println("Journey Started!");
		} else {
			System.out.println("Failed to Start Engine");
		}
	}

}
