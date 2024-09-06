package practicando;

import java.util.Scanner;


//Escriba un programa que pida al usuario que escriba su nombre, y lo salude llamándolo por su nombre.

public class Practicando {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nombre;
        
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Hola, "+nombre);
      
        
        
    }
    
}
