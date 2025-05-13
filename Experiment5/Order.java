package Ecommerce.order;
import Ecommerce.Product;
import java.util.*;

public class Order{
Scanner sc = new Scanner(System.in);
Float totalCost;

public void calculate(){
 totalCost = Product.cost + 25;
 System.out.println("The total cost is: "+totalCost);
 }
 }
