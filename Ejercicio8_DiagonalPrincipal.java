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
public class Ejercicio8_DiagonalPrincipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;

        System.out.println("--- Ejercicio 8: Diagonal principal de matriz 4x4 ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor para la fila " + i + ", columna " + j + ": ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("\nElementos de la diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Posicion [" + i + "][" + i + "]: " + matriz[i][i]);
            sumaDiagonal += matriz[i][i];
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }
}
