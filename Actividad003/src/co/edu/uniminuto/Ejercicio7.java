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
public class Ejercicio7 {

    /**
     * Realizar un programa que genere una matriz 5x5, inicializarla en 2 e 
     * imprimirla.
     */
    public static void main(String[] args) 
            
    {
        Scanner scanner = new Scanner(System.in);
         int[][] matriz = new int[5][5];

        // Inicializar la matriz en 2
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 2;
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz 5x5 inicializada en 2:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
    }
    
}
}