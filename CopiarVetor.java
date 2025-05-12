package com.mycompany.copiarvetor;
import java.util.Scanner;
//Faça um programa que copie o conteúdo de um vetor em um segundo vetor.
public class CopiarVetor {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vetorOriginal = new int[5];
            int[] vetorCopia = new int[5];
            
            // Preenchendo o vetor original
            System.out.println("Digite 5 números para o vetor original:");
            for (int i = 0; i < vetorOriginal.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                vetorOriginal[i] = scanner.nextInt();
            }
            
            // Copiando os valores para o vetor de cópia
            System.arraycopy(vetorOriginal, 0, vetorCopia, 0, vetorOriginal.length);
            
            // Exibindo os vetores
            System.out.println("\nVetor Original:");
            for (int num : vetorOriginal) {
                System.out.print(num + " ");
            }
            
            System.out.println("\nVetor Copiado:");
            for (int num : vetorCopia) {
                System.out.print(num + " ");
            }
        }
    }
}
