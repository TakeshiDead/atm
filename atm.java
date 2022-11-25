/*P á g i n a | 1
Realizar un Cajero automático que pueda realizar las
siguientes funciones
 Solicitar clave de acceso
 Si la clave es correcta presentar el siguiente menú de
opciones:
 Consulta de Balance
 Depósitos
 Retiros
 Transferencias
 Salir del sistema
Debe preparar 4 clases:
- La clase que Permite validar la entrada al cajero (Login)
- La clase del cajero Automático (CajeroAutomatico)
- La clase de la Cuenta de Banco (CuentaBancaria)
- La clase Principal desde donde se ejecuta el programa
(Main)
Utilizar métodos, funciones, matrices y encapsulación de
datos en las clases donde sea necesario. */

public class atm{
    public static void main(String arg[]){
        int balance, withdraw, deposit;
        String pin;

        System.out.println("\n\n\n\n*************\\\\   Welcome to the BEST ATM    ////*************\n");
        System.out.println("                   ***Select a option***\n");
        System.out.print("---------------------------------------------------------------");
        System.out.println("                                                             ");
        System.out.println("|   (1) Check your balance.      (2) Make a withdraw.         |");
        System.out.println("|                                                             |");
        System.out.println("|   (3) Make a deposit.          (4) EXIT.                    |");
        System.out.print("---------------------------------------------------------------\n");
        System.out.print("--OPTION: ");
    }
}

/*  int balance, withdraw, deposit;
    String password;
    
    System.out.print("*************\\\\   Welcome to the BEST ATM    ////*************");

    Scanner sc = new Scanner(System.in); 
    
    if(x!=password){
        System.out.println("try again");
    }else{
        System.out.println("Thank you !");
    }
    
    Scanner s = new Scanner(System.in);
    while(true){
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

    */
   