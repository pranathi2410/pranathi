package blockingqueue;
import java.util.concurrent.*;

public class producer implements Runnable {
	BlockingQueue<Integer> queue;
	public producer(BlockingQueue queue){
		this.queue=queue;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("producer adding value"+i);
			try{
				queue.put(i);
				Thread.sleep(3000);
			}
			catch(Exception e){
				System.out.println(e);
			}
			
		}
	}


}
