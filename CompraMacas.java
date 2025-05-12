package com.mycompany.compramacas;
import java.util.Scanner;
//As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12 unidades. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.
public class CompraMacas {

    public static void main(String[] args) {
      
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.print("Digite a quantidade de maçãs compradas: ");
            int quantidade = scanner.nextInt();
            
            
            double precoPorUnidade;
            if (quantidade < 12) {
                precoPorUnidade = 1.30;
            } else {
                precoPorUnidade = 1.00;
            }
            
            
            double total = quantidade * precoPorUnidade;
            
           
            System.out.printf("Valor total da compra: R$ %.2f\n", total);
        }
    }
}