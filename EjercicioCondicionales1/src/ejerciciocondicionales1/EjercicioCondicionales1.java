package ejerciciocondicionales1;

import java.util.Scanner;

/**
 *
 * @author andres
 */
public class EjercicioCondicionales1 {

    public static void main(String[] args) {
        System.out.println("Digita tu nombre");

        Scanner sc = new Scanner(System.in);
        String nombre;
        nombre = "";

        nombre = sc.nextLine();// Retorna el string que se ingresa por consola
        if ("Andres".equals(nombre)) {
            System.out.println("Adios Andres");
        } else {
            System.out.println("Un saludo");
        }

    }
}
