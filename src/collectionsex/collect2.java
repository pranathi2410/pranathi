package collectionsex;
import java.util.*;



public class collect2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set st=new HashSet();
		st.add("toy car");
		st.add("teddy bear");
		st.add("toy bus");
		st.add("guitar");
		st.add("colour crayons");
		st.add("candles");
		System.out.println(st);
		System.out.println(st.remove("guitar"));
		System.out.println(st);
		System.out.println(st.add("toy bus"));
		System.out.println(st);

	}

}
