package threadapp;

public class synchronizex implements Runnable {
	String name;
	String address;
	synchronizex(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	public void run()
	{
		synchronized(this)
		{
			System.out.println(this.name);
			System.out.println(this.address);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		synchronizex t=new synchronizex("erric","park street");
		Thread t1=new Thread(t);
		t1.start();

	}

}
