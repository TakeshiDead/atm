import java.util.Objects;
import java.util.Scanner;

public class Vistas {
    Scanner sc = new Scanner(System.in);
    ATMProcess atmProcess = new ATMProcess();
    public  void ViewLogin(){

        int pin;
        Login login = new Login();

        System.out.println("\n\n\n\n*************\\\\\\\\    RIVEG ATM    ////*************\n");
        System.out.print("--------------------------------------------------\n");
        System.out.println("|                                                |");
        System.out.println("|             - Introduzca su pin -              |");
        System.out.println("|                                                |");
        System.out.print("--------------------------------------------------\n");
        System.out.print("                    PIN: ");

        pin = sc.nextInt();
        Account cuenta = login.validatePin(pin);

        if(Objects.nonNull(cuenta)){
            ViewAccount(cuenta);
        }else{
            System.out.println("Pin incorrecto.");
            ViewLogin();
        }
    }
    public void ViewRegister(){
        int pin;
        String nombre ;
        float cantidad;

        System.out.println("\n\n\n\n*************\\\\\\\\    RIVEG ATM    ////*************\n");
        System.out.print("--------------------------------------------------\n");
        System.out.println("|                                                |");
        System.out.println("|             - Introduzca su pin -              |");
        System.out.println("|                                                |");
        System.out.print("--------------------------------------------------\n");
        System.out.print("                    PIN: ");

        pin = sc.nextInt();

        System.out.println("\n\n\n\n*************\\\\\\\\    RIVEG ATM    ////*************\n");
        System.out.print("--------------------------------------------------\n");
        System.out.println("|                                                |");
        System.out.println("|             - Introduzca su nombre -           |");
        System.out.println("|                                                |");
        System.out.print("--------------------------------------------------\n");
        System.out.print("                    Nombre: ");

        sc.nextLine();
        nombre = sc.nextLine();

        System.out.println("\n\n\n\n*************\\\\\\\\    RIVEG ATM    ////*************\n");
        System.out.print("--------------------------------------------------\n");
        System.out.println("|                                                |");
        System.out.println("|         - Introduzca su primer deposito -      |");
        System.out.println("|                                                |");
        System.out.print("--------------------------------------------------\n");
        System.out.print("                    Cantidad: $");
        cantidad = sc.nextFloat();

        Account account = new Account(pin, cantidad, nombre);
        Main.cuentas.add(account);

        System.out.println("\n\n\n\n*************\\\\\\\\   Welcome to the RIVEG ATM    ////*************\n");
        System.out.println("     ***Bienvenido "+nombre+", ha depositado: $ "+cantidad+" DOP.***\n");
        System.out.println("                 Recuerda tu PIN:  ("+pin+").");
        System.out.print("---------------------------------------------------------------\n");
        System.out.println("|                                                             |");
        System.out.println("|   (1) Realizar transaccion.       (2) Salir de la cuenta.   |");
        System.out.println("|                                                             |");
        System.out.print("---------------------------------------------------------------\n");
        System.out.println("                                                             ");
        System.out.print("¿Cúal es tu opción? ");

        int option = sc.nextInt();

        switch (option){
            case 1:
                ViewAccount(account);
                break;
            case 2:
                break;
        }
    }
    public void ViewAccount(Account cuenta){
        System.out.println("\n\n\n\n*************\\\\\\\\    RIVEG ATM    ////*************\n");
        System.out.println("            *** Bienvenido, "+cuenta.getName()+"! ***\n");
        System.out.println("           *** Selecciona una opcion ***\n");
        System.out.print("---------------------------------------------------------------");
        System.out.println("|                                                             |");
        System.out.println("|   (1) Consulta de Balance.      (4) Retiros.                |");
        System.out.println("|                                                             |");
        System.out.println("|   (2) Depósitos.                (5) EXIT.                   |");
        System.out.println("|                                                             |");
        System.out.println("|   (3) Transferencias *                                      |");
        System.out.println("|                                                             |");
        System.out.println("--------------------------------------------------------------\n");
        System.out.print("¿Cúal es tu opción? ");

        int option = sc.nextInt();

        switch (option){
            case 1:
                ViewBalance(cuenta);
                break;
            case 2:
                ViewDeposit(cuenta);
                break;
            case 3:
                ViewTransfer(cuenta);
                break;
            case 4:
                ViewWithdraw(cuenta);
                break;
            case 5:
                break;
        }
    }
    public void ViewBalance(Account cuenta){
        System.out.println("\n\n\n\n*************\\\\\\\\   Welcome to the RIVEG ATM    ////*************\n");
        System.out.println("        ***Bienvenido "+cuenta.getName()+", esta es su cuenta.***\n");
        System.out.println("                 Recuerda tu PIN:  ("+cuenta.getPin()+").");
        System.out.print("---------------------------------------------------------------\n");
        System.out.println("|                                                             |");
        System.out.println("|   Su saldo es: DOP $"+cuenta.getBalance()+"."+"             |");
        System.out.println("|                                                             |");
        System.out.println("|   1) Retiro.                  2) Depósitos.                 |");
        System.out.println("|                                                             |");
        System.out.println("|   3) Transferencias.          4) EXIT.                      |");
        System.out.print("---------------------------------------------------------------\n");
        System.out.println("                                                             ");
        System.out.print("¿Cúal es tu opción? ");

        int option = sc.nextInt();

        switch (option){
            case 1:
                ViewWithdraw(cuenta);
            case 2:
                ViewDeposit(cuenta);
                break;
            case 3:
                ViewTransfer(cuenta);
                break;
            case 4:
                break;
        }
    }
    public void ViewDeposit(Account cuenta){
        System.out.println("\n\n\n\n*************\\\\\\\\   Welcome to the RIVEG ATM    ////*************\n");
        System.out.println("         ***Bienvenido "+cuenta.getName()+", esta es su cuenta.***\n");
        System.out.println("                 Recuerda tu PIN:  ("+cuenta.getPin()+").");
        System.out.print("---------------------------------------------------------------\n");
        System.out.println("|                                                             |");
        System.out.println("|   Su saldo es: DOP $ "+cuenta.getBalance()+"."+"            |");
        System.out.println("|                                                             |");
        System.out.println("|   ¿Cuanto desea depositar?                                  |");
        System.out.println("|                                                             |");
        System.out.println("---------------------------------------------------------------\n");
        System.out.print("Deposito de: $");

        int deposito = sc.nextInt();
        atmProcess.deposit(cuenta, deposito);
        System.out.println("Depósito exitoso. Usted ha depósitado: $"+deposito+" DOP, haciendo un total de: DOP $"
                +cuenta.getBalance()+" vuelva pronto "+cuenta.getName()+".");
    }
    public void ViewWithdraw(Account cuenta){
        System.out.println("\n\n\n\n*************\\\\\\\\   Welcome to the RIVEG ATM    ////*************\n");
        System.out.println("     ***Bienvenido "+cuenta.getName()+", esta es su cuenta.***\n");
        System.out.println("                 Recuerda tu PIN:  ("+cuenta.getPin()+").");
        System.out.print("---------------------------------------------------------------\n");
        System.out.println("|                                                             |");
        System.out.println("|   Su saldo es: DOP $"+cuenta.getBalance()+"."+"             |");
        System.out.println("|                                                             |");
        System.out.println("|   ¿Cuanto desea retirar?                                    |");
        System.out.println("|                                                             |");
        System.out.println("---------------------------------------------------------------\n");
        System.out.print("Retiro de: $");
        int retiro = sc.nextInt();

        boolean retired = atmProcess.withdraw(cuenta, retiro);

        if(retired){
            System.out.print("Retiro exitoso. Usted ha retirado: $"+retiro+" DOP, haciendo un total de: DOP $"
                    +cuenta.getBalance()+", vuelva pronto "
                    +cuenta.getName()+".");
        }else{
            System.out.print("Retiro fallido, no cuenta con saldo suficiente.");
        }
    }
    public void ViewTransfer(Account cuenta){
        System.out.println("\n\n\n\n*************\\\\\\\\   Welcome to the RIVEG ATM    ////*************\n");
        System.out.println("     ***Bienvenido "+cuenta.getName()+", esta es su cuenta.***\n");
        System.out.print("---------------------------------------------------------------\n");
        System.out.println("|                                                             |");
        System.out.println("|   Su saldo es: DOP $"+cuenta.getBalance()+"."+"             |");
        System.out.println("|                                                             |");
        System.out.print("---------------------------------------------------------------\n");

        if(Main.cuentas.size()==1){
            System.out.print("---------------------------------------------------------------");
            System.out.println("|             No tienes beneficiarios inscritos               |");
            System.out.println("|                                                             |");
            System.out.println("|            Espere 3 Segundos para volver al menú.           |");
            System.out.println("---------------------------------------------------------------\n");

            try {
                //Ponemos a "Dormir" el programa durante los ms que queremos
                Thread.sleep(5*1000);
            }
            catch (Exception e) {
            }
            ViewAccount(cuenta);

        }else{
            System.out.println("Beneficiarios Inscritos: \n");
            for(int i = 1; i <= Main.cuentas.size(); i++){
                String name = Main.cuentas.get(i-1).getName();

                if (!name.equals(cuenta.getName())){
                    System.out.println(i+") "+name);
                }
            }
            System.out.print("\nDigite el numero de la persona: ");

            int option = sc.nextInt();

            if(option > Main.cuentas.size()){
                System.out.println("Esta opcion no es valida.");
                ViewTransfer(cuenta);
            }else{
                System.out.println("\n\n\n\n*************\\\\\\\\   Welcome to the RIVEG ATM    ////*************\n");
                System.out.println("     ***Bienvenido "+cuenta.getName()+", esta es su cuenta.***\n");
                System.out.println("---------------------------------------------------------------");
                System.out.println("|                                                             |");
                System.out.println("|   Cantidad a transferir.                                    |");
                System.out.println("|                                                             |");
                System.out.println("---------------------------------------------------------------\n");
                System.out.print("Digite la cantidad: ");

                int transferCant = sc.nextInt();
                Account cuentaDestino = Main.cuentas.get(option-1);

                boolean transferSuccess = atmProcess.transfer(cuenta, cuentaDestino, transferCant);

                if(transferSuccess){
                    System.out.println("Transferencia exitosa. Usted ha transferido: $"+transferCant
                            +" DOP, a "+cuentaDestino.getName()+".");
                }else{
                    System.out.println("Transferencia fallida, no cuenta con saldo suficiente.");
                }
            }
        }
    }
}
