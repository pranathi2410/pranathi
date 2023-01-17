package filehandle;
import java.io.*;

public class filex1 {
	public static void main(String[] args){
		try{
			File obj=new File("C://Users//PCHIKKAV//OneDrive - Capgemini//Documents//demo2.txt");
			System.out.println("Name of file:" +obj.getName());
			System.out.println("path of file:" +obj.getPath());
		}
		catch(Exception e)
		{
			
		}
	}

}
