package collectionsex;
import java.util.*;

public class collect3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> a=new TreeSet();
		a.add(23);
		a.add(45);
		a.add(11);
		a.add(19);
		a.add(55);
		a.add(22);
		a.add(18);
		a.add(32);
		System.out.println(a);
		int i=a.ceiling(20);
		System.out.println(i);
		int i1=a.floor(15);
		System.out.println(i1);
		int i2=a.higher(50);
		System.out.println(i2);
		int i3=a.lower(25);
		System.out.println(i3);
		System.out.println(a.descendingSet());
		

	}

}
