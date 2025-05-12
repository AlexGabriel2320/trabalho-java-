package com.mycompany.verificadorprefixo;
import java.util.Scanner;
//Crie uma função que receba duas palavras e retorne True caso a primeira palavra seja um prefixo da segunda
public class VerificadorPrefixo {

    
    public static boolean ehPrefixo(String palavra1, String palavra2) {
        return palavra2.startsWith(palavra1);
    }

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Digite a primeira palavra (possível prefixo): ");
            String palavra1 = scanner.nextLine();
            
           
            System.out.print("Digite a segunda palavra: ");
            String palavra2 = scanner.nextLine();
            
            
            if (ehPrefixo(palavra1, palavra2)) {
                System.out.println("Resultado: \"" + palavra1 + "\" é prefixo de \"" + palavra2 + "\".");
            } else {
                System.out.println("Resultado: \"" + palavra1 + "\" NÃO é prefixo de \"" + palavra2 + "\".");
            }
        }
    }
}