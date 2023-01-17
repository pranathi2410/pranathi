package terminalops;
import java.util.concurrent.*;

 class MyNumberGenerator implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			try{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

public class fixedthread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumberGenerator n=new MyNumberGenerator();
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(int i=0;i<10;i++)
		{
		    service.execute(n);
		}
		    

	}

}
