
import java.util.*;
interface Shape {
public double area();

class Rectangle implements Shape {
 double length, width;
Rectangle(double length, double width) {
this.length = length;
this.width = width;
}
public double area() {
return length * width;
 }
}
class Triangle implements Shape {
 double base, height;
Triangle(double base, double height) {
this.base = base;
this.height = height;
}
public double area() {
return 0.5 * base * height;
    }
}

 class MainArea1 {
public static void main(String[] args) {
Shape rectangle = new Rectangle(10, 5);
Shape triangle = new Triangle(6, 8);
 System.out.println("Area of Rectangle: " + rectangle.area());
 System.out.println("Area of Triangle: " + triangle.area());
    }
}
}