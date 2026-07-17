/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglosymatrices;

import java.util.Scanner;

/**
 *
 * @author Johan David Auilar Cardenas
 */
public class Ejercicio4_ParesImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        System.out.println("--- Ejercicio 4: Numeros pares e impares ---");
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el numero #" + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();

            if (numeros[i] % 2 == 0) {
                cantidadPares++;
                sumaPares += numeros[i];
            } else {
                cantidadImpares++;
                sumaImpares += numeros[i];
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Cantidad de numeros pares: " + cantidadPares);
        System.out.println("Cantidad de numeros impares: " + cantidadImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);
    }
}
