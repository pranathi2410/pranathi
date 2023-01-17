package anonymousd;

public class CalculatorApp {
	public void getAmount(InterestCalculator i)
	{
		System.out.println("S I" +i.simpleInterest(1300,3,4));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorApp c=new CalculatorApp();
		c.getAmount((p,r,t)-> p*r*t/100);
	}

	}

