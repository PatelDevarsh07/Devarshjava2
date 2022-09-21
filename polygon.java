package j8abstractclass;

abstract class polygon1
{
	public abstract void area(double h,double b);
}
class triangle extends polygon1
{
	@Override
	public void area(double h, double b) {
		double area=h*b*0.5;
		System.out.println("Area of triangle is=> "+area);
	}	
}
class rectangle extends polygon1
{
	@Override
	public void area(double h, double b) {
		double rarea=h*b;
		System.out.println("Area of rectangle is=>"+rarea);		
	}	
}
public class polygon {

	public static void main(String[] args) {
	
		triangle t1=new triangle();
		t1.area(100,200);
		rectangle r1=new rectangle();
		r1.area(100,200);
	}
}
