package iostreams;
import java.io.*;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader reader=new FileReader("C://Users//PCHIKKAV//OneDrive - Capgemini//Documents//demo2.txt");
			BufferedReader buffer=new BufferedReader(reader);
			String cstr;
			while((cstr=buffer.readLine())!=null)
				System.out.println(cstr);
		}
			catch(FileNotFoundException e)
			{
				System.out.println(e);
			}
			
		    catch(IOException e1)
		   {
			System.out.println(e1);
		}
		}
		

	}

