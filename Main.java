
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Account> cuentas = new ArrayList<>();
    public static void main(String arg[]){

        int option;
        boolean continuar = true;

        Vistas vs = new Vistas();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\n\n*************\\\\\\\\   Welcome to the BEST ATM    ////*************\n");
        System.out.println("                ***Seleccione una opcion***\n");
        System.out.print("---------------------------------------------------------------\n");
        System.out.println("|                                                             |");
        System.out.println("|       (1) Iniciar Sesion.       (2) Crear una cuenta        |");
        System.out.println("|                                                             |");
        System.out.println("---------------------------------------------------------------\n");
        System.out.print("¿Cúal es tu opción? ");

        option = sc.nextInt();

        switch (option){
            case 1:
                vs.viewLogin();
                break;
            case 2:
                vs.viewRegister();
                break;
            default:
                System.out.print("vamo a ve");
        }

        if(continuar){
            main(arg);
        }

    }
}