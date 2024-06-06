/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author duvan
 */
public class Ejercicio9 {

    /**
     * Realizar un programa que genere un arreglo de 50 posiciones y 
     * se rellene de con la función ramdom de Java 
     * (los números deben ser 1 a 99), luego de llenar hacer
la impresión de la matriz.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un arreglo de 50 posiciones
        int[] arreglo = new int[50];

        // Llenar el arreglo con números aleatorios del 1 al 99
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            arreglo[i] = rand.nextInt(99) + 1;
        }

        // Imprimir el arreglo
        System.out.println("Arreglo de 50 posiciones lleno con "
                + "números aleatorios:");
        for (int i = 0; i < 50; i++) {
            System.out.print(arreglo[i] + " ");
    }
    
}
}