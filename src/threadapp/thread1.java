package threadapp;

public class thread1 extends Thread {
	int i=0;
	public void run()
	{

		System.out.println("Name of the customer:");
		System.out.println("Discount on price");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
thread1 t=new thread1();
thread1 t1=new thread1();
t.start();
t1.start();
	}

}
