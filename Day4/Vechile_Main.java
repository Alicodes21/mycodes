package Day4;

class Vehicle {

	 private String make;
	 private String model;
	 private int year;
	 private String fuelType;

	 public Vehicle(String make, String model, int year, String fuelType) {
	     this.make = make;
	     this.model = model;
	     this.year = year;
	     this.fuelType = fuelType;
	 }

	 // Getters and Setters
	 public String getMake() {
	     return make;
	 }

	 public void setMake(String make) {
	     this.make = make;
	 }

	 public String getModel() {
	     return model;
	 }

	 public void setModel(String model) {
	     this.model = model;
	 }

	 public int getYear() {
	     return year;
	 }

	 public void setYear(int year) {
	     this.year = year;
	 }

	 public String getFuelType() {
	     return fuelType;
	 }

	 public void setFuelType(String fuelType) {
	     this.fuelType = fuelType;
	 }

	 public double calculateFuelEfficiency() {
	     return 0.0;
	 }

	 public double calculateDistanceTraveled(double fuelConsumed) {
	     return 0.0;
	 }

	 public double getMaxSpeed() {
	     return 0.0;
	 }
	}
	class Truck extends Vehicle {
	 private int cargoCapacity;
	 public Truck(String make, String model, int year, String fuelType, int cargoCapacity) {
	     super(make, model, year, fuelType);
	     this.cargoCapacity = cargoCapacity;
	 }
	}

	//Subclass Car
	class Car extends Vehicle {
	 private int passengerCapacity;

	 public Car(String make, String model, int year, String fuelType, int passengerCapacity) {
	     super(make, model, year, fuelType);
	     this.passengerCapacity = passengerCapacity;
	 }
	}

	class Motorcycle extends Vehicle {
	 private boolean hasSideCar;

	 public Motorcycle(String make, String model, int year, String fuelType, boolean hasSideCar) {
	     super(make, model, year, fuelType);
	     this.hasSideCar = hasSideCar;
	 }
	}
public class Vechile_Main {
	public static void name(String []args) {
		Car car = new Car("Toyota", "Corolla", 2022, "Gasoline", 5);
	     Truck truck = new Truck("Ford", "F-150", 2021, "Diesel", 1500);
	     Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Sportster", 2023, "Gasoline", false);

	     car.setMake("Honda");
	     System.out.println(car.getMake());

	     double carFuelEfficiency = car.calculateFuelEfficiency();
	     double truckMaxSpeed = truck.getMaxSpeed();
	     double motorcycleDistance = motorcycle.calculateDistanceTraveled(30.0);
	}

}
