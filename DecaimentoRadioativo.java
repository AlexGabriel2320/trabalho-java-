package com.mycompany.decaimentoradioativo;
//Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a massa inicial, em gramas, faça um programa que determine o tempo necessário para que essa massa se torne menor que 0,05 gramas.
import java.util.Scanner;

public class DecaimentoRadioativo {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
          
            System.out.print("Digite a quantidade inicial de átomos: ");
            double quantidadeInicial = scanner.nextDouble();
            
            System.out.print("Digite a constante de decaimento (em 1/s): ");
            double constante = scanner.nextDouble();
            
            System.out.print("Digite o tempo (em segundos): ");
            double tempo = scanner.nextDouble();
            
            
            double quantidadeRestante = quantidadeInicial * Math.exp(-constante * tempo);
            
           
            System.out.printf("Quantidade restante após %.2f segundos: %.4f%n", tempo, quantidadeRestante);
        }
    }
}


