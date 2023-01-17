package iostreams;
import java.io.*;

public class customer implements Serializable {
	String customername;
	String address;
	public customer(String customername,String address)
	{
		this.customername=customername;
		this.address=address;
	}

	public  void showDetails() {
		System.out.println("Customer name" +customername);
		System.out.println("Address" +address);
		
		// TODO Auto-generated method stub

	}

}
