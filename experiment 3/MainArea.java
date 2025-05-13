abstract class Shape {
double dim1;
double dim2;
Shape(double d1, double d2) {
dim1 = d1;
dim2 = d2;
}
abstract double area();
}
class Rectangle extends Shape {
Rectangle(double length, double width) {
super(length, width);
}
double area() {
return dim1 * dim2;
}
}
class Triangle extends Shape {
Triangle(double base, double height) {
super(base, height);
}
double area() {
return 0.5 * dim1 * dim2;
}
}
public class MainArea {
public static void main(String[] args) {
Shape rectangle = new Rectangle(10, 5);
Shape triangle = new Triangle(6, 8);
System.out.println("Area of Rectangle: " +
rectangle.area());
System.out.println("Area of Triangle: " +
triangle.area());
}
}