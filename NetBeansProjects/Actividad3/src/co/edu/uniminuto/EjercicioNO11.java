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
public class EjercicioNO11 {

    /**
     * Generar una matriz nxn (dado por el usuario) el valor de n debe ser
     * mayor a 2 y
menor a 10 y llenarla con números aleatorios.
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño de la matriz (n)
        int n;
        do {
            System.out.print("Ingrese el tamaño de la matriz (n): ");
            n = scanner.nextInt();
            if (n < 3 || n > 9) {
                System.out.println("El tamaño de la matriz debe estar entre"
                        + " 3 y 9.");
            }
        } while (n < 3 || n > 9);

        // Crear una matriz nxn
        int[][] matriz = new int[n][n];

        // Llenar la matriz con números aleatorios
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(101); // Genera números aleatorios entre 0 y 100
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz " + n + "x" + n + " llenada con números aleatorios:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
    
}
