package LibraryManagement;
import java.util.*;
public class Book{

Scanner sc = new Scanner(System.in);
String title;
String author;
int ISBN;
public void info(){
System.out.println("Enter the name of title: ");
title=sc.nextLine();
System.out.println("Enter the name of author: ");
author=sc.nextLine();
System.out.println("Enter the ISBN: ");
ISBN=sc.nextInt();

}
public void see(){
System.out.println(" Title of book is: "+title);
System.out.println(" Author of book is: "+author);
System.out.println(" ISBN of book is: "+ISBN);

}
}
