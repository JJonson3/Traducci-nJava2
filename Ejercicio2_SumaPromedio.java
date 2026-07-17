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
public class Ejercicio2_SumaPromedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;
        double promedio;

        System.out.println("--- Ejercicio 2: Suma y promedio ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero real #" + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
            suma += numeros[i];
        }

        promedio = suma / numeros.length;

        System.out.println("\nResultados:");
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
