package j2bank;

import java.util.Scanner;

class bankdetails
{
	private int acno;
	private String cname;
	private int balance;
	private int deposit;
	private int with;
	 
	
	
	
	public void openac()
	{	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account number => ");
		acno=sc.nextInt();
		
		System.out.println("Enter customer name => ");
		cname=sc.next();
		
		System.out.println("Enter balance => ");
		balance=sc.nextInt();					
	}
	public void deposit()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur deposit => ");
		deposit=sc.nextInt();
		balance=balance+deposit;
	}
	public void with()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur withdraw => ");
		with=sc.nextInt();
		balance=balance-with;
	}
	public void printac()
	{
		System.out.println("Account number => "+acno+"Customer name => "+cname+"Balance => "+balance);		
	}
}

public class bank {

	public static void main(String[] args) {
		bankdetails b1=new bankdetails();
		
		b1.openac();
		b1.printac();
		b1.deposit();
		b1.printac();
		b1.with();
		b1.printac();		
	}
}
