package filehandle;
import java.io.RandomAccessFile;

public class filex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			RandomAccessFile raf=new RandomAccessFile("C://Users//PCHIKKAV//OneDrive - Capgemini//Documents//mytext.txt","rw");
			String[] a={"Apple","Banana","Mango","Pineapple"};
			for(int i=0;i<a.length;i++)
			{
				raf.seek(i);
				raf.writeUTF(a[i]);
				raf.seek(0);
				String str=raf.readLine();
				System.out.println(str);
			}
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
