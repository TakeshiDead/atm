import java.util.Scanner;
public class atm
{
    public static void main(String args[] )
    { 
        int balance = 5000, withdraw, deposit;
        int pin = 1234;
       
       
         Scanner s = new Scanner(System.in);
        while(true){ 

            System.out.println("Please enter your 4 digit pin");
          int answer = s.nextInt();

         if (answer != pin ){ System.out.println("Invalid pin");

         }
        
         else if (answer == pin) {
             System.out.println("Thank you !");
             // leave the first loop
             
             
         }
        System.out.println("");

         
     
        while(answer==pin)
        {
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
                System.out.println("Your Money has been successfully deposited");
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
}