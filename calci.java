package j1calci;

import java.util.Scanner;

class math
{
	private int a;
	private int b;
	
	public void setdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A => ");
		a=sc.nextInt();
		
		System.out.println("Enter Balance => ");
		b=sc.nextInt();					
	}
	public void printdata()
	{
		System.out.println("A => "+a+"B => "+b);		
	}	
	public void add()
	{
		System.out.println("Add => "+(a+b));		
	}
	public void sub()
	{
		System.out.println("Sub => "+(a-b));		
	}
	public void mul()
	{
		System.out.println("Mul => "+(a*b));		
	}
	public void div()
	{
		System.out.println("Div => "+(a/b));		
	}
}

public class calci {

	public static void main(String[] args) {
		
		math m1=new math();		
		
		m1.setdata();				
		m1.printdata();
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();
		
	}
}
