import java.util.Scanner;

class student
{
	private int no;
	private String name;
	private int eng;
	private int hindi;
	
	public void setdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no => ");
		no=sc.nextInt();
		
		System.out.println("Enter name => ");
		name=sc.next();
		
		System.out.println("Enter eng marks => ");
		eng=sc.nextInt();
		
		System.out.println("Enter hindi  marks => ");
		hindi=sc.nextInt();		
	}
	public void printdata()
	{
		System.out.println("No => "+no+"Name => "+name+"English marks => "+eng+"Hindi marks => "+hindi);
		
	}
}
public class j2student {

	public static void main(String[] args) {
		
		student s1=new student();
		student s2=new student();
		
		s1.setdata();
		s2.setdata();
		
		s1.printdata();
		s2.printdata();

	}

}
