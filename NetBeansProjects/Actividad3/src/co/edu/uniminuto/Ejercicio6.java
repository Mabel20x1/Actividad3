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
public class Ejercicio6 {

    /**
     * Leer N cantidad de notas (validar rango de notas), imprimir el promedio 
     * de las notas, la nota más alta y la más baja.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas: ");
        int cantidadNotas = scanner.nextInt();

        // Validar que la cantidad de notas sea mayor que 0
        if (cantidadNotas <= 0) {
            System.out.println("La cantidad de notas debe ser mayor que 0.");
            return;
        }

        double sumaNotas = 0;
        double notaMasAlta = Double.MIN_VALUE;
        double notaMasBaja = Double.MAX_VALUE;

        for (int i = 1; i <= cantidadNotas; i++) {
            double nota;
            do {
                System.out.print("Ingrese la nota #" + i + ": ");
                nota = scanner.nextDouble();
                // Validar que la nota sea mayor o igual a 0
                if (nota < 0) {
                    System.out.println("La nota debe ser mayor o igual a 0.");
                }
            } while (nota < 0);

            sumaNotas += nota;

            // Actualizar la nota más alta
            if (nota > notaMasAlta) {
                notaMasAlta = nota;
            }

            // Actualizar la nota más baja
            if (nota < notaMasBaja) {
                notaMasBaja = nota;
            }
        }

        double promedio = sumaNotas / cantidadNotas;

        System.out.println("Promedio de las notas: " + promedio);
        System.out.println("Nota más alta: " + notaMasAlta);
        System.out.println("Nota más baja: " + notaMasBaja);

        scanner.close();
    }
    
}
