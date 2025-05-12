package com.mycompany.matriztransposta;
//Faça um programa que dada a seguinte matriz A, gere a matriz transposta dela At. Matriz transposta é a que se obtém trocando-se ordenadamente as linhas pelas colunas.




import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
          
            System.out.print("Digite o número de linhas da matriz: ");
            int linhas = scanner.nextInt();
            System.out.print("Digite o número de colunas da matriz: ");
            int colunas = scanner.nextInt();
            
            int[][] matriz = new int[linhas][colunas];
            int[][] transposta = new int[colunas][linhas];
            
            
            System.out.println("\nDigite os elementos da matriz:");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.printf("Elemento [%d][%d]: ", i, j);
                    matriz[i][j] = scanner.nextInt();
                }
            }
            
            
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    transposta[j][i] = matriz[i][j];
                }
            }
            
            
            System.out.println("\nMatriz Original:");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            
            
            System.out.println("\nMatriz Transposta:");
            for (int i = 0; i < colunas; i++) {
                for (int j = 0; j < linhas; j++) {
                    System.out.print(transposta[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}