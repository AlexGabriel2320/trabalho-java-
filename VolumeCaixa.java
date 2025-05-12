package com.mycompany.volumecaixa;
import java.util.Scanner;

public class VolumeCaixa {
    public static void main(String[] args) {
        // Leitura dos dados
        try (Scanner scanner = new Scanner(System.in)) {
            // Leitura dos dados
            System.out.print("Digite o comprimento da caixa: ");
            double comprimento = scanner.nextDouble();
            
            System.out.print("Digite a largura da caixa: ");
            double largura = scanner.nextDouble();
            
            System.out.print("Digite a altura da caixa: ");
            double altura = scanner.nextDouble();
            
            // Cálculo do volume
            double volume = comprimento * largura * altura;
            
            // Exibição do resultado
            System.out.println("O volume da caixa é: " + volume);
        }
    }
}
