package com.mycompany.somavetores;
import java.util.Scanner;
//Faça um programa que some o conteúdo de dois vetores e armazene o resultado em um terceiro vetor
public class SomaVetores {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
           
            int tamanho = 5;
            
            
            int[] vetor1 = new int[tamanho];
            int[] vetor2 = new int[tamanho];
            int[] vetorSoma = new int[tamanho];
            
            
            System.out.println("Digite os valores para o primeiro vetor:");
            for (var i = 0; i < tamanho; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                vetor1[i] = scanner.nextInt();
            }
            
            System.out.println("Digite os valores para o segundo vetor:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                vetor2[i] = scanner.nextInt();
            }
            
            
            for (int i = 0; i < tamanho; i++) {
                vetorSoma[i] = vetor1[i] + vetor2[i];
            }
            
            
            System.out.println("\nVetor resultante da soma:");
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Elemento " + (i + 1) + ": " + vetorSoma[i]);
            }
        }
    }
}
