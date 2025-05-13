import java.io.*;
import java.util.*;
public class StudentInfo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter student name: ");
String name = sc.nextLine();
System.out.print("Enter student age: ");
int age = sc.nextInt();
System.out.print("Enter student weight:
");
double weight = sc.nextDouble();
System.out.print("Enter student height:
");
double height = sc.nextDouble();
sc.nextLine();
System.out.print("Enter student city: ");
String city = sc.nextLine();
System.out.print("Enter student phone
number: ");
String phoneNumber = sc.nextLine();
try (DataOutputStream dos = new
DataOutputStream(new
FileOutputStream("studentInfo.dat"))) {
dos.writeUTF(name);
dos.writeInt(age);
dos.writeDouble(weight);
dos.writeDouble(height);
dos.writeUTF(city);
dos.writeUTF(phoneNumber);
System.out.println("\nData has been
written to the file.");
} catch (IOException e) {
System.out.println("Error while writing
to file: " + e.getMessage());
}try (DataInputStream dis = new
DataInputStream(new
FileInputStream("studentInfo.dat"))) {
System.out.println("\nReading student
information from file:");
System.out.println("Name: " +
dis.readUTF());
System.out.println("Age: " +
dis.readInt());
System.out.println("Weight: " +
dis.readDouble());
System.out.println("Height: " +
dis.readDouble());
System.out.println("City: " +
dis.readUTF());
System.out.println("Phone Number: " +
dis.readUTF());
} catch (IOException e) {
System.out.println("Error while reading
from file: " + e.getMessage());
}sc.close();
}
}