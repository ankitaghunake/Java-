import java.util.Scanner;
class Student {
int rollNumber;
void setRollNumber(int r) {
rollNumber = r;
}
void displayRollNumber() {
System.out.println("Roll Number: " + rollNumber);
}
}
class Test extends Student {
int sub1, sub2;
void setMarks(int s1, int s2) {
sub1 = s1;
sub2 = s2;
}
void displayMarks() {
System.out.println("Subject 1 Marks: " + sub1);
System.out.println("Subject 2 Marks: " + sub2);
}
}
class Result extends Test {
void displayResult() {
int total = sub1 + sub2;
System.out.println("Total Marks: " + total);
}
}
public class MultilevelInheritance {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Result student = new Result();
System.out.print("Enter Roll Number: ");
student.setRollNumber(sc.nextInt());
System.out.print("Enter marks for Subject 1: ");
int marks1 = sc.nextInt();
System.out.print("Enter marks for Subject 2: ");
int marks2 = sc.nextInt();
student.setMarks(marks1, marks2);
System.out.println();
student.displayRollNumber();
student.displayMarks();
student.displayResult();
sc.close();
}
}
