package threadapp;

public class threadex  extends Thread{
	public void run()
	{
		try{
			for(int i=0;i<=5;i++)
			{
				Thread.sleep(3000);
				System.out.println(i);
			}
			System.out.println("Thread ended..");
			
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
threadex t=new threadex();
		t.start();
		

	}

}
