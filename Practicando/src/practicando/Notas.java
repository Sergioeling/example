
package practicando;

import java.util.Scanner;

public class Notas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("**************Ingrese sus notas**************\n");
        
        System.out.print("Primera nota: ");
        double pn = sc.nextDouble();
        
        System.out.print("Primera seginda: ");
        double pn2 = sc.nextDouble();
        
        System.out.print("Primera nota: ");
        double pn3 = sc.nextDouble();
        
        System.out.print("Primera nota: ");
        double pn4 = sc.nextDouble();
        
        System.out.println("\n");
        
        
        double promedio = (pn + pn2 + pn3 + pn4) / 4;
        System.out.println("El promedio es: " + promedio);
            
        
        
    }
    
}
