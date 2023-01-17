package terminalops;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stlist=new ArrayList<>();
		stlist.add(new Student("john",80));
		stlist.add(new Student("peter",40));
		stlist.add(new Student("jason",38));
		stlist.add(new Student("erric",55));
		Comparator<Student> mlist=(a,b)->
		{
			if(a.marks==b.marks)
			{
				return 0;
			}else if(a.marks>b.marks)
			{
				return 1;
			}else
			{
				return -1;
			}
			
		};
		Stream<Student> studentstream=stlist.stream();
		Predicate<Student> studentpredicate=(a)->a.marks>50;
		studentstream.filter(studentpredicate).forEach(System.out::println);
		

	}

}
