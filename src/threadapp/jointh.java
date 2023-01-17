package threadapp;

public class jointh extends Thread {
	public jointh()
	{
		setName("Childthread");
	}

	public void run()
	{
		try
		{
			System.out.println(getName()+" has started.....");
			Thread.currentThread().join();
		}
		catch(Exception e)
		{
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"started...");
		jointh t=new jointh();
		t.start();

	}

}
