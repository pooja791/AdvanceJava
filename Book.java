package fullstackjava;

public class Book {
 String title;
 String author;
 Book( String title, String author)
 {
	 this.title=title;
	 this.author=author;
 }
 void display()
 {
	 System.out.println("title"+title+"author"+author);
 }
 public static void main(String[]args)
 {
	 Book obj=new Book("shamchi aai","sane gurugi");
	 obj.display();
 }
}

