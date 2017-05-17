package ejerciciocondicionales1;

import java.util.Scanner;

public class EjercicioCondicionales2{
    public static void main(String[] args){ 
        System.out.println("Digite el primer numero");
        
        Scanner leer = new Scanner(System.in);
        Scanner leerOperador = new Scanner(System.in);
        int num1;
        num1= leer.nextInt();
        
        System.out.println("Digite el segundo numero");
        
        int num2;
        num2= leer.nextInt();
        
        System.out.println("seleccione la operacion a realizar");
        
        String operador;
        operador= leerOperador.nextLine();
        
        switch (operador){
            case "+":
                System.out.println( num1 + num2); 
                
            break;
            
            case "-":
                    System.out.println(num1 - num2);
            break;
            
            case "*":
                    System.out.println(num1 * num2);
            break;
            
            default:
                System.out.println("Error 404 !!");
                
            break;
        }
        
        
    }
}