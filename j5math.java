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
}
public class j5math {

	public static void main(String[] args) {
		
		math m1=new math();
		math m2=new math();
		
		m1.setdata();
		m2.setdata();
		
		m1.printdata();
		m2.printdata();

	}
}
