/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglosymatrices;

import java.util.Scanner;

/**
 *
 * @author Johan David Aguilar Cardenas
 */
public class Ejercicio5_Modificacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[12];
        int numIngresado;

        System.out.println("--- Ejercicio 5: Modificacion del arreglo ---");
        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.print("Ingrese un numero positivo para la posicion " + i + ": ");
                numIngresado = teclado.nextInt();
                if (numIngresado <= 0) {
                    System.out.println("El numero debe ser positivo. Intente nuevamente.");
                }
            } while (numIngresado <= 0);

            numeros[i] = numIngresado + i;
        }

        System.out.println("\nArreglo resultante tras sumar el indice a cada numero:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}
