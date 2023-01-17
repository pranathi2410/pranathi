package threadapp;

public class thread2 extends Thread{
	public void Simple(){
		System.out.println("S I:"+(3000*12*5/100));
	}
	
	public void run()
	{
		Simple();
	}

	

}
