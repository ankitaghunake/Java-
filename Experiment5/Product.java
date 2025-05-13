package Ecommerce;
import java.util.*;

public class Product{
 Scanner sc = new Scanner(System.in);
 String productName;
 String category;
 public static float cost;
 
 public void getInfo(){
 System.out.println("Enter the product name: ");
 productName = sc.nextLine();
 System.out.println("Enter the product category: ");
 category = sc.nextLine();
 System.out.println("Enter the product cost: ");
 cost = sc.nextFloat();
 }
 
 public void setInfo(){
 System.out.println("The product name is: "+productName);
 System.out.println("The product category is: "+category);
 System.out.println("The product cost is: "+cost);
 }
 
 }
 
 
 
 
 
 
