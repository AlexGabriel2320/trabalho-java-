package com.mycompany.matriz2x4;
import java.util.Scanner;
//Faça um programa para ler e imprimir uma matriz 2 × 4 de números inteiros.
public class Matriz2x4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] matriz = new int[2][4];
            
           
            System.out.println("Digite os elementos da matriz 2x4:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.printf("Elemento [%d][%d]: ", i, j);
                    matriz[i][j] = scanner.nextInt();
                }
            }
            
          
            System.out.println("\nMatriz 2x4:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}

