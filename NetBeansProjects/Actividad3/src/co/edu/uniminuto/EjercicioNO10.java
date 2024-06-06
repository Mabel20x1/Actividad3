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
public class EjercicioNO10 {

    /**
     * Realizar un programa que genere una matriz 5x6 y se rellene 
     * dinámicamente con los números impares partiendo desde n 
     * (n es dada por el usuario) y se imprima.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número inicial
        System.out.print("Ingrese el número inicial para la matriz: ");
        int numeroInicial = scanner.nextInt();

        // Crear una matriz 5x6
        int[][] matriz = new int[5][6];

        // Rellenar la matriz con números impares a partir de numeroInicial
        int numero = numeroInicial;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = numero;
                numero += 2; // Incrementar el número en 2 para obtener el siguiente impar
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz 5x6 rellenada dinámicamente con números impares:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
}
