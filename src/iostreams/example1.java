package iostreams;
import java.io.*;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fin= new FileInputStream("C://Users//PCHIKKAV//OneDrive - Capgemini//Documents//filedemo.txt");
			byte[] bt=new byte[fin.available()];
			fin.read(bt);
			for(byte b:bt)
			{
				System.out.print((char)b);
			}
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
