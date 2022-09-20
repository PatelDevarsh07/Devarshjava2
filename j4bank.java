import java.util.Scanner;

class bank
{
	private int acno;
	private String cname;
	private int balance;
	
	public void setdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account number => ");
		acno=sc.nextInt();
		
		System.out.println("Enter customer name => ");
		cname=sc.next();
		
		System.out.println("Enter balance => ");
		balance=sc.nextInt();					
	}
	public void printdata()
	{
		System.out.println("Account number => "+acno+"Customer name => "+cname+"Balance => "+balance);		
	}
}
public class j4bank {

	public static void main(String[] args) {
		
		bank b1=new bank();
		bank b2=new bank();
		
		b1.setdata();
		b2.setdata();
		
		b1.printdata();
		b2.printdata();
	}
}
