import java.io.*;
import java.util.*;
public class ReadFile {
public static void main(String[] args) {
try {
File file = new File("sample.txt");
Scanner sc = new Scanner(file);
System.out.println("Reading file content:");
while (sc.hasNextLine()) {
String line = sc.nextLine();
System.out.println(line);
}
sc.close();
} catch (FileNotFoundException e) {
System.out.println("File not found: " +
e.getMessage());
}
}
}
sample.txt contains:
Hello, Ankita .
Welcome to file reading in Java.