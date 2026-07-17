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
public class Ejercicio1_IngresoVisualizacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("--- Ejercicio 1: Ingreso y visualizacion ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero en la posicion " + i + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("\nValores almacenados en el arreglo:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}
