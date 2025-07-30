class Book{
	String title;
	String author;
	double price;
	int quantity;
	double total;
	Book(String title,String author,double price,int quantity){
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		
	}
	public void Total_value() {
		total=price* quantity;
	}
	public void Display_Details() {
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("price:"+price);
		System.out.println("quantity:"+quantity);
	}
}
public class BookDemo {

	public static void main(String[] args) {
		Book Book1=new Book("Rich Dad Poor Dad","Robert kiyosaki",250.00,2);
		Book1.Total_value();
		Book1.Display_Details();
		Book Book2=new Book("The Psychology of Money","Morgan Housel",300.00,2);
		Book2.Total_value();
		Book2.Display_Details();
		Book Book3=new Book("Wings of Fire","APJ Abdul kalam",200.00,2);
		Book3.Total_value();
		Book3.Display_Details();
	}

}
