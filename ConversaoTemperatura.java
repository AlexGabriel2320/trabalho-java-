package com.mycompany.conversaotemperatura;
//Faça um programa que leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit. A fórmula de conversão é: ℉ = (9 × ℃ + 160) ÷ 5, na qual ℉ é a temperatura em Fahrenheit e ℃ é a temperatura em Celsius.
import java.util.Scanner;




public class ConversaoTemperatura {

 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
         System.out.print("Digite a temperatura em graus Celsius: ");
         double celsius = scanner.nextDouble();
         
         
         double fahrenheit = (9 * celsius + 160) / 5;
         
         
         System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + " ℉");
     }
    }
}