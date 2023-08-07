package Day3;

public class Rectangle {
	private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
	public static void main(String[] args) {
		
		double width = 5.0;
        double height = 3.0;

        Rectangle rectangle = new Rectangle(width, height);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Width is " + width);
        System.out.println("Height is " + height);
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);


	}

}
