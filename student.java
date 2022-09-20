package j3student;

import java.util.Scanner;

class s1{
	private int no;
	private String sname;
	private int age;
	
	public void setdata() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number => ");
		no=sc.nextInt();
		
		System.out.println("Enter name => ");
		sname=sc.next();
		
		System.out.println("Enter age => ");
	    age=sc.nextInt();
	}
	public void printdata()
	{
		System.out.println("No : "+no+" Name : "+sname+" Age "+age);		
	}
}

public class student {

	public static void main(String[] args) {
		s1 sone=new s1();
		s1 stwo;
		
		stwo=sone;
		sone.setdata();
		sone.printdata();
		stwo.printdata();
		
		stwo.setdata();
		sone.printdata();
		stwo.printdata();
	}
}
