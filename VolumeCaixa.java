package com.mycompany.volumecaixa;
import java.util.Scanner;
//Faça um programa que leia os valores de COMPRIMENTO, LARGURA e ALTURA e apresente o valor do volume de uma caixa retangular. Utilize para o cálculo a fórmula VOLUME = COMPRIMENTO × LARGURA × ALTURA. em java
public class VolumeCaixa {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Digite o comprimento da caixa: ");
            double comprimento = scanner.nextDouble();
            
            System.out.print("Digite a largura da caixa: ");
            double largura = scanner.nextDouble();
            
            System.out.print("Digite a altura da caixa: ");
            double altura = scanner.nextDouble();
            
            
            double volume = comprimento * largura * altura;
            
           
            System.out.println("O volume da caixa é: " + volume);
        }
    }
}
