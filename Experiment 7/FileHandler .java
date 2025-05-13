import java.io.*;
import java.util.*;
public class FileHandler {
public static void
main(String[] args) {
Scanner sc = new
Scanner(System.in);
System.out.print("Enter
the file name: ");
String fileName =
sc.nextLine();
File file = new
File(fileName);
if (file.exists()) {
try (BufferedReader br
= new BufferedReader(new
FileReader(file))) {
String line;
System.out.println("\nFile
contents:");
while ((line =
br.readLine()) != null) {
System.out.println(line);
}
} catch (IOException e)
{
System.out.println("Error
reading the file: " +
e.getMessage());
}
} else {
try {
if
(file.createNewFile()) {
System.out.println("File
created: " + fileName);
} else {
System.out.println("File
already exists.");
}
} catch (IOException e)
{
System.out.println("Error
creating the file: " +
e.getMessage());
}
}
System.out.print("\nDo
you want to add data to the
end of the file? (Yes/No): ");
String response =
sc.nextLine();
if
(response.equalsIgnoreCase("Yes")) {
try (BufferedWriter bw
= new BufferedWriter(new
FileWriter(file, true))) {
System.out.println("Enter
data to append. Type 'exit' on
a new line to stop:");
String userInput;
while (!(userInput =
sc.nextLine()).equalsIgnoreCas
e("exit")) {
bw.write(userInput);
bw.newLine();
}
System.out.println("Data has
been appended to the file.");
} catch (IOException e)
{
System.out.println("Error
writing to the file: " +
e.getMessage());
}
}
sc.close();
}
}