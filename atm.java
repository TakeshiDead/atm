import java.util.Scanner;
public class atm
{
    public static void main(String args[] )
    { 
        int balance = 5000, withdraw, deposit;
        int password = 123456;
       
        Scanner x = new Scanner(System.in);
        if(x!=password)
        {
            System.out.println("try again");
        }
        else{
            System.out.println("Thank you !");
        }
         Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your password");
            System.out.println("Automated Teller Machine");
            System.out.println("push1 for Withdraw");
            System.out.println("push 2 for Deposit");
            System.out.println("push 3 for Check Balance");
            System.out.println("push 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}