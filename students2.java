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
    public class students2 {
    	
		public static void main(String[] args) {
		s1 s[]=new s1[100];
		int n,i;
		System.out.println("Enter entry's:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	for(i=0;i<n;i++)
	{
		s[i]=new s1();
		s[i].setdata();
	}
	for(i=0;i<n;i++)
	{
		s[i].printdata();
	}
	}
}
