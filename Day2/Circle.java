package Day2;

public class Circle {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	

	public Circle() {
		this.radius = 1.0;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
