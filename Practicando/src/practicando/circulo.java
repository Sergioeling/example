/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando;

//Escriba un programa que reciba como entrada el radio de un círculo y entregue como salida 

import java.util.Scanner;

//su perímetro y su área Pi*R2

public class circulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();
        
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        
        //double perimetro = 2 * Math.PI * radio;
        //double area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("El perimetro del circulo es "+ perimetro);
        System.out.println("El perimetro del circulo es "+  area);
        
        
    }
}
