import MathOperations.Floor;
import MathOperations.Round;
import MathOperations.Ceil;
import java.util.*;

public class Matheg{
public static void main(String[] ar){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
float number = sc.nextFloat();

while(true){
System.out.println("\nChoose an option:");
System.out.println("1.floor()\n 2.round()\n3.ceil()\n4.exit");
int choice = sc.nextInt();

switch(choice){
case 1: 
new Floor(number);
break;
case 2:
new Round(number);
break;
case 3: 
new Ceil(number);
break;
case 4:
System.exit(4);
}
}
}
}


