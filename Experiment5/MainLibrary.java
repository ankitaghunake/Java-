import LibraryManagement.Book;
import LibraryManagement.Member;

public class MainLibrary{
public static void main(String args[]){
Book b = new Book();
Member m = new Member();
b.info();
b.see();
m.get();
m.display();
}
}