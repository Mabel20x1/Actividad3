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
public class Ejercicio1 { 
 /*Hacer un programa en Java que sume los siguientes 25 impares que le siguen al
número n (n es determinado por el usuario). Imprimir los 25 impares y la suma.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Declaración de variables
        Scanner leer = new Scanner (System.in);
        int numero;
        int  acumuladorImpares = 0;
        int contadorImpares = 0;
        //lectura de numero
        System.out.println("Dame un numero");
        numero = leer.nextInt ();
        while (contadorImpares < 25) {
            numero++;
            if(numero % 2 != 0) {
                acumuladorImpares+=numero;
                System.out.print(numero+" ");
                contadorImpares++;
                
            
        }
        }
        System.out.println("suma:"+acumuladorImpares);
    }
            
    }
   

