package demo;

public class Book {
int bookId;
String bookTitle;
String author;
double price;
public Book(int bookId, String bookTitle, String author, double price) {
	
	this.bookId = bookId;
	this.bookTitle = bookTitle;
	this.author = author;
	this.price = price;
}

 class Library{
	 
	 void totalbill(double price) {
		 if(price>1000) {
			 double dis=price*0.15;
			 System.out.println("Congrulation You Got a Discount of 15% : "+dis);
			 price=price-dis;
			 System.out.println("Total Bill is : "+price);
			 
		 }
		 
		 
		 }
	 void display() {
		 System.out.println("Book Id : "+bookId);
		 System.out.println("Book Title : "+bookTitle);
		 System.out.println("Book Author Name : "+author);
//		 System.out.println("Your Price : "+price);
		
	 }
 }

	
	
	
}
