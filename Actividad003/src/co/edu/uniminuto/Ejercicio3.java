/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto;

import java.util.Scanner;

/**
 *
 * @author duvan
 */
public class Ejercicio3 {

    /**
     * 3.Hacer un programa en Java que, dado un rango, por el usuario, se da 
     * número inicial y uno final (tomar en cuenta que el inicial debe ser 
     * menor que el final, hacer la validación y volver a pedir los dos 
     * números si no cumple la condición) y sumelos números pares dentro 
     * del rango incluyendo el valor inicial y final.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int numeroInicial, numeroFinal;
        
        do {
            System.out.print("Ingrese el número inicial del rango: ");
            numeroInicial = scanner.nextInt();
            System.out.print("Ingrese el número final del rango: ");
            numeroFinal = scanner.nextInt();
            
            if (numeroInicial >= numeroFinal) {
                System.out.println("El número inicial debe ser menor que el"
                        + " número final. Inténtelo de nuevo.");
            }
        } while (numeroInicial >= numeroFinal);
        
        int sumaPares = 0;
        
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
    }
    
}
        System.out.println("La suma de los números pares dentro del rango es: "
                + "" + sumaPares);
        
        scanner.close();
    }
}
