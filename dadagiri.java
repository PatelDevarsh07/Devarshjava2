package j8abstractclass;

abstract class dadagiri1
{
	public abstract void add(int a,int b);
	public abstract void hi();
}
class dev extends dadagiri1
{
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void hi() {
		// TODO Auto-generated method stub	
	}	
}
class het extends dadagiri1
{
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void hi() {
		// TODO Auto-generated method stub	
	}	
}
public class dadagiri {

	public static void main(String[] args) {
		
     dev d1=new dev();
     d1.add(99,99);
     d1.hi();
     
     het h1=new het();
     h1.add(18,5);
     h1.hi();
	}
}
