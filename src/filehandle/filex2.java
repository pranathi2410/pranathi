package filehandle;
import java.io.*;

public class filex2 {
	public static void main(String[] args){
try{
			File f=new File("C://Users//PCHIKKAV//OneDrive - Capgemini//Documents//myinfo.txt");
			System.out.println("Name of file:" +f.getName());
			System.out.println("path of file:" +f.getPath());
			if(f.exists())
			{
				System.out.println("File exists");
				
			}
			else
			{
				if(f.createNewFile())
				{
					System.out.println("file created");
				}
				else
				{
					System.out.println("file not created");
				}
			}
}
			catch(Exception e)
			{
				System.out.println(e);
			}

   }
}

