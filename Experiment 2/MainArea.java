import java.util.Scanner;
class Area {
double length;
double breadth;
public void setDim(double length, double breadth) {
this.length = length;
this.breadth = breadth;
}
public double getArea() {
return length * breadth;
}
}
public class MainArea {
public static void main(String[] args)
{
Area rectangle = new Area();
Scanner sc = new Scanner(System.in);
System.out.print("Enter the length of the rectangle: ");
double length = sc.nextDouble();
System.out.print("Enter the breadth of the rectangle: ");
double breadth = sc.nextDouble();
rectangle.setDim(length, breadth);
double area = rectangle.getArea();
System.out.println("The area of the rectangle is: " + area);
sc.close();
}
}