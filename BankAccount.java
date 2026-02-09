package BankManagment;
class BankAccount{
    int balance=1000;
    void deposit(int amount)
    {
   	 if(amount>0)
   	 {
   		 balance=balance+amount;
   		 System.out.println("deposit successful");
   	 }
   	 else
   	 {
   		System.out.println("invalid Amount");
   	 }
    }
    void withdraw(int amount)
    {
   	 if(amount>0 && amount<=balance)
   	 {
   		 balance=balance-amount;
   		 System.out.println("cash withdrawl successful");
   	 }
   	 else
   	 {
   		 System.out.println("insufficient balance");
   	 }
    }
    void  checkBalance()
    {
   	 System.out.println("current Balance"+balance);
    }
}

