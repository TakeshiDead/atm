
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

        System.out.println("\n\n\n\n*************\\\\\\\\   Welcome to the RIVEG ATM    ////*************\n");
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
                vs.ViewLogin();
                break;
            case 2:
                vs.ViewRegister();
                break;
            default:
<<<<<<< HEAD
                System.out.print("vamo a ve");
=======
                System.out.print("Esta opcion no es valida, digite nuevamente.");
>>>>>>> f154b9ec811033d611f63204c28cd5139b081a3c
        }
        if(continuar){
            main(arg);
        }
    }
}