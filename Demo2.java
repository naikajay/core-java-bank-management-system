package BankManagment;
import java.util.Scanner;
public class Demo2 {
    public static void main(String[]arg)
    {
    	Scanner sc=new Scanner(System.in);
    	BankAccount account=new BankAccount();
    	
    	while(true)
    	{
    		System.out.println("1.Deposit");
    		System.out.println("2.withdraw");
    		System.out.println("3.check balance");
    		System.out.println("4.Exit");
    		System.out.println("enter your choic");
    		
    		int choice =sc.nextInt();
    		if(choice==1)
    		{
    			System.out.println("enter your amount");
    			int amt=sc.nextInt();
    			account.deposit(amt);
    		}
    		else if(choice==2)
    		{
    			System.out.println("enter your amount");
    			int amt=sc.nextInt();
    			account.withdraw(amt);
    		}
    		else if(choice==3)
    		{
    			account.checkBalance();
    		}
    		else if(choice==4)
    		{
    			System.out.println("thank you");
    			break;
    		}
    		else
    		{
    			System.out.println("invalid choice");
    		}
    	}
    }
}
