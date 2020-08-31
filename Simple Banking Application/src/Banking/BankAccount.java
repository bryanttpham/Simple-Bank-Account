package Banking;
import java.util.Scanner;

public class BankAccount {
	
	
	
	public static void main (String[] args)
	{
		
	}

	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid)
	{
		customerName=cname;
		customerId=cid;
	}
	
	void deposit(int amount)
	{
		if(amount!=0)
		{
			balance= balance+amount;
			previousTransaction=amount;
		}
	}

	void withdraw(int amount)
	{
		if(amount!=0)
		{
			balance=balance-amount;
			previousTransaction=-amount;
		}
		
	}
	
	void getPreviousTransaction()
	{
		if(previousTransaction>0)
		{
			System.out.println("Deposited: "+ previousTransaction);
		}
		else if(previousTransaction<0)
		{
			System.out.println("Withdrawed: "+ previousTransaction);
			
		}
		else {
			System.out.println("No previous transactions were made");
		}
		
	}

	void showMenu()
	{
		char option='a';
		
		Scanner scan= new Scanner(System.in);
	System.out.println("Welcome "+ customerName);
	System.out.println("Your ID is "+ customerId);
	System.out.println("\n");
	System.out.println("A. Check Balance");
	System.out.println("B. Deposit");
	System.out.println("C. Withdaraw"); 
	System.out.println("D. Previous Transaction");
	System.out.println("E. Exit");
	
	do {
		System.out.println("=============================================================");
		System.out.println("Enter an option");
		System.out.println("=============================================================");
		option=scan.next().charAt(0);
		System.out.println("\n");
		
		switch(option)
		{
		case 'A':
			System.out.println("-------------------------------------------------------------------");
			System.out.println("Balance = "+balance);
			System.out.println("-------------------------------------------------------------------");
			System.out.println("Done");
			System.out.println("\n");
			break;
		case 'B':
			System.out.println("-------------------------------------------------------------------");
			System.out.println("How much would you like to deposit?");
			System.out.println("-------------------------------------------------------------------");
			int amountD= scan.nextInt();
			deposit(amountD);
			System.out.println("Done");
			System.out.println("\n");
			break;
		case 'C':
			System.out.println("-------------------------------------------------------------------\"");
			System.out.println("How much would you like to withdraw?");
			System.out.println("-------------------------------------------------------------------\"");
			int amountW=scan.nextInt();
			withdraw(amountW);
			System.out.println("Done");
			System.out.println("\n");
			break;
		case 'D':
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Your previous transaction was: +getPreviousTransaction()");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Done");
			System.out.println("\n");
			break;
		case 'E':
			System.out.println("**********************************************************************");
			break;
		}
		
	
		
	}while(option!='E');
		System.out.println("Thank you for using our product!");
		
	}
	
	
	
	
	
	
	
	
	


		

}
