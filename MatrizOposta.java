package com.mycompany.matrizoposta;
import java.util.Scanner;
//Faça um programa que dada a matriz A, gere a matriz oposta -A. Matriz oposta possui valores que se somados à matriz original, gera uma matriz com valores zerados.
public class MatrizOposta {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] matrizA = new int[2][4];
            int[][] matrizOposta = new int[2][4];
            
            
            System.out.println("Digite os elementos da matriz A (2x4):");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.printf("A[%d][%d]: ", i, j);
                    matrizA[i][j] = scanner.nextInt();
                }
            }
            
           
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    matrizOposta[i][j] = -matrizA[i][j];
                }
            }
           
            System.out.println("\nMatriz A:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matrizA[i][j] + "\t");
                }
                System.out.println();
            }
            
            
            System.out.println("\nMatriz Oposta (-A):");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matrizOposta[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}

