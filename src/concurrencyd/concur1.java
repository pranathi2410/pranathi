package concurrencyd;
import java.util.concurrent.*;
import java.util.Iterator;


public class concur1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();
		map.put("Thomas", 12);
		map.put("william", 32);
		map.put("samuel", 53);
		map.put("erric", 62);
		map.put("maurice", 13);
		map.put("henry", 23);
		
		Iterator<ConcurrentHashMap.Entry<String,Integer>> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			ConcurrentHashMap.Entry<String,Integer> entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println(map);
		map.putIfAbsent("jacob",14);
		System.out.println(map);
		
		
		

	}

}
