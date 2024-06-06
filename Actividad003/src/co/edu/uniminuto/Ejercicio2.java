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
public class Ejercicio2 {

    /**
     * 2.Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3 
     * (para ser
sumado debe verificarse que sea múltiplo de 5 y 3 a la vez) comprendidos entre
* 1
y n (n es determinado por el usuario). Imprimir la cantidad de múltiplos de 
* 5 y 3.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de n: ");
        int numero = scanner.nextInt();
        
        int cantidadMultiplos = 0;
        int sumaMultiplos = 0;
        
        for (int i = 1; i <= numero; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                cantidadMultiplos++;
                sumaMultiplos += i;
    }
    
}
         System.out.println("La cantidad de múltiplos de 5 y 3 entre 1 y " +
                 numero + " es: " + cantidadMultiplos);
        System.out.println("La suma de los múltiplos de 5 y 3 entre 1 y " + 
                numero + " es: " + sumaMultiplos);
        
        scanner.close();
    }
}
