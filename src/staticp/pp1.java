package staticp;

public class pp1 {
	public void interest(float amount)
	{
		System.out.println("Amount"+amount);
	}
	public void interest(float principal,float rate,float time)
	{
		System.out.println("Principal amt"+principal);
		System.out.println("Rate"+rate);
		System.out.println("time period"+time);
	}
	public void interest(float principal,float total_interest)
	{
		System.out.println("total interest"+total_interest);
		
	}
	public static void main(String args[])
	{
		pp1 in=new pp1();
		in.interest(3000);
		in.interest(800,1800);
	}

}
