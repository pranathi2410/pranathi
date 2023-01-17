package anonymousd;
import java.util.List;
import java.util.function.*;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> t=new ArrayList<Integer>();
		t.add(100);
		t.add(104);
		t.add(98);
		t.add(97);
		t.add(99);
		t.add(98);
		t.add(96);
		t.add(99);
		Consumer<Integer> c=(t1)->
		{
			if(t1>=100)
			{
				System.out.println("Temp is above 100");
				
			}else{
				System.out.println("Temp is normal");
			}
		};
		for(int i:t)
		{
			c.accept(i);
		}
		

	}


}
