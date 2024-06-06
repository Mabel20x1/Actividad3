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
public class Ejercicio4 {

    /**
     * Realizar un programa en Java que dado n cantidad de números determine 
     * si esprimo o no y si ese número primo es múltiplo de 3, se debe contar. 
     * Imprimir
cantidad de primos y cantidad de múltiplos de 3
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números que desea verificar: ");
        int cantidadNumeros = scanner.nextInt();
        
        int cantidadPrimos = 0;
        int cantidadMultiplosDeTres = 0;
        
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            int numero = scanner.nextInt();
            
            if (esPrimo(numero)) {
                cantidadPrimos++;
                if (numero % 3 == 0) {
                    cantidadMultiplosDeTres++;
                }
            }
        }
        
        System.out.println("Cantidad de números primos: " + cantidadPrimos);
        System.out.println("Cantidad de primos múltiplos de 3: " + cantidadMultiplosDeTres);
        
        scanner.close();
    }
    
    // Método para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
