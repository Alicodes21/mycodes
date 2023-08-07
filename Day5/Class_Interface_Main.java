package Day5;

interface IShape {
    boolean fitsText(String message);
}

class Circle implements IShape {
    int radius;
    String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public boolean fitsText(String message) {
        return message.length() < (2 * this.radius);
    }
}

class Rectangle implements IShape {
    int length;
    int width;
    String color;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public boolean fitsText(String message) {
        return message.length() < this.width;
    }
}

class Sign {
    IShape shape;
    String text;

    public Sign(IShape shape, String text) {
        this.shape = shape;
        this.text = text;
    }
}

public class Class_Interface_Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red");
        Rectangle rectangle = new Rectangle(10, 5, "Blue");

        Sign circleSign = new Sign(circle, "Circle Sign");
        Sign rectangleSign = new Sign(rectangle, "Rectangle Sign");

        System.out.println("Circle Sign fits text: " + circleSign.shape.fitsText(circleSign.text));
        System.out.println("Rectangle Sign fits text: " + rectangleSign.shape.fitsText(rectangleSign.text));
    }
}
