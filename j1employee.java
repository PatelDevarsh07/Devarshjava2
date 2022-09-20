import java.util.Scanner;

class emp
{
	private int eno;
	private String ename;
	private int salary;
	
	public void setdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter eno => ");
		eno=sc.nextInt();
		
		System.out.println("Enter ename => ");
		ename=sc.next();
		
		System.out.println("Enter salary => ");
		salary=sc.nextInt();		
	}
	public void printdata()
	{
		System.out.println("Eno => "+eno+"Ename => "+ename+"Salary => "+salary);
		
	}
}

public class j1employee {
	
		public static void main(String[] args) {
		
			emp e1=new emp();
			emp e2=new emp();
			
			e1.setdata();
			e2.setdata();
			
			e1.printdata();
			e2.printdata();
					
	}

}
