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
public class Ejercicio9_MayorMenorMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int mayor;
        int menor;

        System.out.println("--- Ejercicio 9: Mayor y menor de matriz 5x5 ---");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese el valor para la fila " + i + ", columna " + j + ": ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        mayor = matriz[0][0];
        menor = matriz[0][0];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Mayor valor de la matriz: " + mayor);
        System.out.println("Menor valor de la matriz: " + menor);
    }
}
