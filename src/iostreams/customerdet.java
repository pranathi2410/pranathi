package iostreams;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class customerdet{
		// TODO Auto-generated method stub
		try
		   {
			FileInputStream fin= new FileInputStream("C://Users//PCHIKKAV//OneDrive - Capgemini//Documents//filedemo.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			customerdet customer=(customerdet)objin.readObject();
			customer.printDetails();
		    }
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
	    catch(IOException e1)
	   {
		System.out.println(e1);
	   }
		catch(ClassNotFoundException e2)
        {
            System.out.println(e2);
        }

		
	public static void main(String[] args)
	{
		customer acc=new customer("peter",35);
		customerdet records=new customerdet();
		records.writeToFile(acc);
		records.readToFile();
		
	}	

}
