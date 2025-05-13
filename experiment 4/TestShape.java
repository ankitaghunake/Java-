public interface Shape {
    double area();
}
public class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        length = length;
        width = width;
    }
    public double area() {
        return length * width;
    }
}
public class Triangle implements Shape {
    private double base;
    private double height;
public Triangle(double base, double height) {
        base = base;
        height = height;
    }
    public double area() {
        return 0.5 * base * height;
    }
}
public class TestShape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,3);
        Shape triangle = new Triangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
