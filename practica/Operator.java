package PracticaMP.practica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operator extends Operation {

    private ArrayList<Administrador> listaAdmins = new ArrayList<>();

    public Operator(){

    }
    public void doOperation(){
        mostrarMenu();
    }

    public void register(){
        Scanner sn = new Scanner(System.in);
       
        System.out.println("1. Nombre");
        String nombre = sn.nextLine();
        System.out.println("2. Nick");
        String nick = sn.nextLine();
        System.out.println("3. Password");
        String contraseña= sn.nextLine();
 
        Administrador admin = new Administrador(nombre,nick,contraseña);

        listaAdmins.add(admin);
    }

    public void enter(){
        Scanner sn = new Scanner(System.in);
       
        System.out.println("1. Nombre");
        String nombre = sn.nextLine();
        System.out.println("2. Nick");
        String nick = sn.nextLine();
        System.out.println("3. Password");
        String contraseña= sn.nextLine();
 
        Administrador admin = new Administrador(nombre,nick,contraseña);

        if (Arrays.asList(listaAdmins).contains(admin)) {
            OperatorMenu menu = new OperatorMenu(admin);

            menu.doOperation();
        }
    }

    public void mostrarMenu(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
 
        while (!salir) {
 
            System.out.println("1. Registrarse");
            System.out.println("2. Entrar");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Registrarse");
                        register();
                        break;
                    case 2:
                        System.out.println("Has seleccionado Entrar");
                        enter();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }    
}
