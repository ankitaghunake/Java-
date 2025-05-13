import java.lang.*;
import java.util.*;

class NegAgeException extends Exception {
    public String toString() {
        return "Negative number not allowed";
    }
}

class abc {
    public static void main(String args[]) {
        int age;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age: ");
            age = sc.nextInt();
            if (age < 0) {
                throw new NegAgeException();
            } else {
                System.out.println("Your age is: " + age);
            }
        } catch (NegAgeException e) {
            System.out.println(e);
        } 
    }
}