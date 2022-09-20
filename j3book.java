import java.util.Scanner;

class book
{
	private int bookid;
	private String bookname;
	private int bookprice;
	
	public void setdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter bookid => ");
		bookid=sc.nextInt();
		
		System.out.println("Enter bookname => ");
		bookname=sc.next();
		
		System.out.println("Enter bookprice => ");
		bookprice=sc.nextInt();					
	}
	public void printdata()
	{
		System.out.println("Bookid => "+bookid+"Bookname => "+bookname+"Bookprice => "+bookprice);		
	}
}
public class j3book {

	public static void main(String[] args) {
		
		book b1=new book();
		book b2=new book();
		
		b1.setdata();
		b2.setdata();
		
		b1.printdata();
		b2.printdata();
	}
}
