import java.util.*;
import java.lang.*;
class OddNumberException extends Exception {
    public String toString() {
        return "Odd number is not allowed";
}
}
 class OddDemo1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        try {
            if (num % 2 != 0) {
                throw new OddNumberException();
            } else {
                System.out.println("You entered an even number: " + num);
            }
        } catch (OddNumberException e) {
            System.out.println(e);
        } 
        
    }
 }