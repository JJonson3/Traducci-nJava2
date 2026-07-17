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
public class Ejercicio3_MayorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[15];
        int mayor;
        int menor;
        int posMayor = 0;
        int posMenor = 0;

        System.out.println("--- Ejercicio 3: Mayor y menor ---");
        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el numero en la posicion " + i + ": ");
            numeros[i] = teclado.nextInt();
        }

        mayor = numeros[0];
        menor = numeros[0];

        for (int i = 1; i < 15; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Posicion donde se encuentra el mayor: " + posMayor);
        System.out.println("Posicion donde se encuentra el menor: " + posMenor);
    }
}
