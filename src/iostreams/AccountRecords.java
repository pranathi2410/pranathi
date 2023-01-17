package iostreams;
import java.util.*;

public class AccountRecords {
	public void writeToFile(Account obj)
    {

          try{
          FileOutputStream fout=new FileOutputStream("d://myaccount.txt");
          ObjectOutputStream objout=new ObjectOutputStream(fout);
          objout.writeObject(obj);
          objout.flush();
          }
          catch(FileNotFoundException e)
          {
              System.out.println(e);
          }
          catch(IOException e)
          {
              System.out.println(e);
          }
    }
    public void readFromFile()
    {
        try{
            FileInputStream fin=new FileInputStream("C://Users//PCHIKKAV//OneDrive - Capgemini//Documents//demo2.txt");
            ObjectInputStream objin=new ObjectInputStream(fin);
           Account account=(Account)objin.readObject();
           account.printDetails();
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
    }

  public static void main(String[] args) {
      // TODO Auto-generated method stub
	  
       Account acc=new Account("Savings","Peter",12000);
       AccountRecords records=new AccountRecords();
       records.writeToFile(acc);



       records.readFromFile();


  }



}
