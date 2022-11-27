import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Vistas {
    Scanner sc = new Scanner(System.in);
    public  void viewLogin(){

        int pin;
        Login login = new Login();

        System.out.println("\n\n\n\n*************\\\\\\\\    BEST ATM    ////*************\n");
        System.out.print("--------------------------------------------------\n");
        System.out.println("|                                                |");
        System.out.println("|             - Introduzca su pin -              |");
        System.out.println("|                                                |");
        System.out.print("--------------------------------------------------\n");
        System.out.print("                    PIN: ");

        pin = sc.nextInt();

        Account cuenta = login.validatePin(pin);

        if(Objects.nonNull(cuenta)){
            viewAccount(cuenta);
        }else{
            System.out.println("Pin incorrecto.");
            viewLogin();
        }
    }

    public void viewRegister(){
        int pin;
        String nombre ;
        float cantidad;

        System.out.println("\n\n\n\n*************\\\\\\\\    BEST ATM    ////*************\n");
        System.out.print("--------------------------------------------------\n");
        System.out.println("|                                                |");
        System.out.println("|             - Introduzca su pin -              |");
        System.out.println("|                                                |");
        System.out.print("--------------------------------------------------\n");
        System.out.print("                    PIN: ");

        pin = sc.nextInt();

        System.out.println("\n\n\n\n*************\\\\\\\\    BEST ATM    ////*************\n");
        System.out.print("--------------------------------------------------\n");
        System.out.println("|                                                |");
        System.out.println("|             - Introduzca su nombre -           |");
        System.out.println("|                                                |");
        System.out.print("--------------------------------------------------\n");
        System.out.print("                    Nombre: ");

        sc.nextLine();
        nombre = sc.nextLine();

        System.out.println("\n\n\n\n*************\\\\\\\\    BEST ATM    ////*************\n");
        System.out.print("--------------------------------------------------\n");
        System.out.println("|                                                |");
        System.out.println("|         - Introduzca su primer deposito -      |");
        System.out.println("|                                                |");
        System.out.print("--------------------------------------------------\n");
        System.out.print("                    Cantidad: $");
        cantidad = sc.nextFloat();

        Account account = new Account(pin, cantidad, nombre);
        Main.cuentas.add(account);

        System.out.println("\n\n\n\n*************\\\\\\\\   Welcome to the BEST ATM    ////*************\n");
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
                viewAccount(account);
                break;
            case 2:
                break;
        }
    }

    public void viewAccount(Account cuenta){
        System.out.println("\n\n\n\n*************\\\\\\\\    BEST ATM    ////*************\n");
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
                viewBalance();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                break;
        }

    }
    public void viewBalance(){

    }
}
