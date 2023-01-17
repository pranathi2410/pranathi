package terminalops;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.*;

public class AnyMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numberlist=new ArrayList();
		numberlist.add(12);
		numberlist.add(11);
		numberlist.add(19);
		numberlist.add(23);
		numberlist.add(45);
		numberlist.add(56);
		numberlist.add(78);
		numberlist.add(89);
		Stream <Integer>stream=numberlist.stream();
		System.out.println(stream.anyMatch((a)->a >100));

	}

}
