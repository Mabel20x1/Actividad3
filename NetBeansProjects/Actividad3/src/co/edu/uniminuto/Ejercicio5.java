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
public class Ejercicio5 {

    /**
     * Dado N cantidad de precios de gaseosas en un supermercado el gerente de 
     * ventas desea que se genere un programa que le permita saber cuál de las 
     * gaseosas tieneel mayor precio, cuál tiene menor precio y cuál es el 
     * precio promedio. Hacer las
impresiones según lo requerido
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de precios de gaseosas: ");
        int cantidadPrecios = scanner.nextInt();
        
        // Validar que la cantidad de precios sea mayor que 0
        if (cantidadPrecios <= 0) {
            System.out.println("La cantidad de precios debe ser mayor que 0.");
            return;
        }
        
        double precioMayor = Double.MIN_VALUE;
        double precioMenor = Double.MAX_VALUE;
        double sumaPrecios = 0;
        
        for (int i = 1; i <= cantidadPrecios; i++) {
            System.out.print("Ingrese el precio de la gaseosa #" + i + ": ");
            double precio = scanner.nextDouble();
            
            // Actualizar el precio mayor
            if (precio > precioMayor) {
                precioMayor = precio;
            }
            
            // Actualizar el precio menor
            if (precio < precioMenor) {
                precioMenor = precio;
            }
            
            // Sumar el precio para calcular el promedio
            sumaPrecios += precio;
        }
        
        double precioPromedio = sumaPrecios / cantidadPrecios;
        
        System.out.println("El precio mayor es: " + precioMayor);
        System.out.println("El precio menor es: " + precioMenor);
        System.out.println("El precio promedio es: " + precioPromedio);
        
        scanner.close();

    }
    
}
