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
public class Ejercicio8 {

    /**
     * Realizar un programa que genere una matriz 7x7, inicializarla la diagonal
principal con el número “0”(cero), el resto de las posiciones deben ser - (
* guion).Imprimir la matriz.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
         // Crear una matriz 7x7
        char[][] matriz = new char[7][7];

        // Inicializar la diagonal principal con 0 y el resto con -
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    matriz[i][j] = '0'; 
// Inicializar la diagonal principal con 0
                } else {
                    matriz[i][j] = '-'; // Inicializar el resto con -
                }
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz 7x7 con la diagonal principal inicializada"
                + " en 0:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
    }
    
}
}
