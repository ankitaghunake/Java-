package LibraryManagement;

import java.util.*;

public class Member {
    Scanner sc = new Scanner(System.in);
    String name;
    long phone;

    public void get() {
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the Phone no: ");
        phone = sc.nextLong();
    }

    public void display() {
        System.out.println("Name of member is: " + name);
        System.out.println("Phone no is: " + phone);
    }
}
