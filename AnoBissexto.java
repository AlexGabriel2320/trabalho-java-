package com.mycompany.anobissexto;
import java.util.Scanner;
//Crie uma função que receba como parâmetro um inteiro positivo ano e devolve verdadeiro ou falso se ano for bissexto ou não. Anos bissextos ocorrem a cada quatro anos exceto anos múltiplos de 100 que não são múltiplos de 400.
public class AnoBissexto {

    // Função que verifica se um ano é bissexto
    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um ano: ");
            int ano = scanner.nextInt();
            
            if (ehBissexto(ano)) {
                System.out.println(ano + " é um ano bissexto.");
            } else {
                System.out.println(ano + " não é um ano bissexto.");
            }
        }
    }
}