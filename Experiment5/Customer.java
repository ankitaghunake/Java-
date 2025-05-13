package Ecommerce;
import java.util.*;

public class Customer{
Scanner sc = new Scanner(System.in);
String name;
String add;
long no;

public void takeDetails(){
System.out.println("Enter the name of customer: ");
name = sc.nextLine();
System.out.println("Enter the address of customer: ");
add = sc.nextLine();
System.out.println("Enter the contact number of customer: ");
no = sc.nextLong();
}

public void displayDetails(){
System.out.println("The name of customer is: "+name);
System.out.println("The address of customer is: "+add);
System.out.println("The contact number is: "+no);
}
}
