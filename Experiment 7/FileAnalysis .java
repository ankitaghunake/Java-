import java.io.*;
public class FileAnalysis {
public static void main(String[]
args) {
File file = new
File("sample.txt");
int vowelCount = 0;
int wordCount = 0;
int aCount = 0;
try (BufferedReader br = new
BufferedReader(new FileReader(file))) {
String line;
while ((line =
br.readLine()) != null) {
for (int i = 0; i <
line.length(); i++) {
char ch =
line.charAt(i);
if (isVowel(ch)) {
vowelCount++;
}
if (ch == 'a' || ch ==
'A') {
aCount++;
}
}
String[] words =
line.split("\\s+");
wordCount +=
words.length;
}
System.out.println("Total
number of vowels: " + vowelCount);
System.out.println("Total
number of words: " +
wordCount);
System.out.println("Number of
times 'a' appears: " + aCount);
} catch (IOException e) {
System.out.println("Error
reading the file: " +
e.getMessage());
}
}
private static boolean
isVowel(char ch) {
ch =
Character.toLowerCase(ch);
return ch == 'a' || ch == 'e'
|| ch == 'i' || ch == 'o' || ch ==
'u';
}
}
Sample.txt contains:
Hello, Everyone Myself Divya Sutar.
I am from Kadamwadi,Kolhapur.
Currently studying in DYPCET !