package iostreams;
import java.util.*; 

public class Account implements Serializable{
	String accountType;
	String customerName;
	float balance;
	
	   public Account(String accountType,String customerName,float balance)
	   {
		   this.accountType=accountType;
		   this.customerName=customerName;
		   this.balance=balance;
	   }

	public  void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Customer Name "+customerName);
		System.out.println("Account Type"+accountType);
		System.out.println("Balance"+balance);

	}

}
