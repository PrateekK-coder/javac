package javaAssignment2;
import java.util.*;

public class question3 {
	class UnsupportedTransactionException extends Exception
	{
	    
	    @Override
	    public String getMessage()
	    {
	        return "Unsupported Transaction Exception";
	    }
	}

	 class BankingSystem
	{
		void transc(String transactionType)
		{
	        String expression = transactionType;      
	        switch(expression)
	        {
	            case "Credit": System.out.println("Credit");
	            break;
	            case "Debit": System.out.println("Debit");
	            break;
	            case "Balance Inquiry": System.out.println("Balance Inquiry");
	            break;
	            case "Pin Change": System.out.println("Pin Change");
	            break;
	            default: try {
	                throw new UnsupportedTransactionException();
	            } catch (Exception e) {
	                
	                System.out.println(e.getMessage());
	            }
	        }
	}

		public void main(String[] args) 
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a choice: ");
			String transc=sc.next();
			
			BankingSystem bs=new BankingSystem();
			bs.transc(transc);

		}

	}

}
