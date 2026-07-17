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
public class Ejercicio7_SumaElementos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaTotal = 0;

        System.out.println("--- Ejercicio 7: Suma de todos los elementos de matriz 4x4 ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor para la fila " + i + ", columna " + j + ": ");
                matriz[i][j] = teclado.nextInt();
                sumaTotal += matriz[i][j];
            }
        }

        System.out.println("\nSuma total de todos los elementos de la matriz: " + sumaTotal);
    }
}
