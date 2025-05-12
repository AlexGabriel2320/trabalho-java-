package com.mycompany.vetor;
//Fazer um algoritmo que calcule e imprima o soma, a média, o maior e o menor dos valores armazenados em um vetor A de 100 elementos numéricos a serem lidos do dispositivo de entrada padrão.
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] A = new double[100];
            
            double soma = 0;
            double maior = Double.NEGATIVE_INFINITY;
            double menor = Double.POSITIVE_INFINITY;
            
            // Leitura dos 100 números
            for (int i = 0; i < 100; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                A[i] = scanner.nextDouble();
                
                soma += A[i];
                
                if (A[i] > maior) {
                    maior = A[i];
                }
                
                if (A[i] < menor) {
                    menor = A[i];
                }
            }
            
            double media = soma / 100;
            
            // Resultados
            System.out.println("\n=== RESULTADOS ===");
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média dos valores: " + media);
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        }
    }
}
