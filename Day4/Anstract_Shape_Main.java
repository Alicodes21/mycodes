package Day4;

abstract class Shape_abstract {

 public abstract double calculateArea();

 public abstract double calculatePerimeter();
}

class Circle_abstract extends Shape_abstract {
 private double radius;

 public Circle_abstract(double radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 @Override
 public double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}

class Triangle extends Shape_abstract {
 private double sideA;
 private double sideB;
 private double sideC;

 public Triangle(double sideA, double sideB, double sideC) {
     this.sideA = sideA;
     this.sideB = sideB;
     this.sideC = sideC;
 }

 public double calculateArea() {
     double s = (sideA + sideB + sideC) / 2.0;
     return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
 }
 @Override
 public double calculatePerimeter() {
     return sideA + sideB + sideC;
 }
}
public class Anstract_Shape_Main {

	public static void main(String[] args) {
		Circle_abstract circle = new Circle_abstract(5.0);
	     Triangle triangle = new Triangle(3.0, 4.0, 5.0);

	     System.out.println("Circle:");
	     System.out.println("Area: " + circle.calculateArea());
	     System.out.println("Perimeter: " + circle.calculatePerimeter());

	     System.out.println("\nTriangle:");
	     System.out.println("Area: " + triangle.calculateArea());
	     System.out.println("Perimeter: " + triangle.calculatePerimeter());

	}

}
