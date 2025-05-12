package com.mycompany.jogo;
//Desenvolva um jogo em que o usuário tenha que adivinhar uma palavra que será mostrada com as letras embaralhadas. O programa terá uma lista de palavras lidas de um arquivo texto ou de um vetor e será escolhida uma aleatoriamente. O jogador terá seis tentativas para adivinhar a palavra. Ao final a palavra deve ser mostrada na tela, informando se o usuário ganhou ou perdeu o jogo.
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Jogo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            
           
            String[] palavras = {
                "computador", "java", "programacao", "teclado", "monitor", "internet", "software"
            };
            
            
            String palavraEscolhida = palavras[random.nextInt(palavras.length)];
            
            
            String palavraEmbaralhada = embaralhar(palavraEscolhida);
            
            System.out.println("===== JOGO DA PALAVRA EMBARALHADA =====");
            System.out.println("Adivinhe a palavra: " + palavraEmbaralhada);
            System.out.println("Você tem 6 tentativas.");
            
            boolean acertou = false;
            
            for (int tentativas = 1; tentativas <= 6; tentativas++) {
                System.out.print("Tentativa " + tentativas + ": ");
                String resposta = scanner.nextLine();
                
                if (resposta.equalsIgnoreCase(palavraEscolhida)) {
                    acertou = true;
                    break;
                } else {
                    System.out.println("Incorreto!");
                }
            }
            
            
            if (acertou) {
                System.out.println("Parabéns! Você acertou a palavra: " + palavraEscolhida);
            } else {
                System.out.println("Você perdeu! A palavra correta era: " + palavraEscolhida);
            }
        }
    }

    
    public static String embaralhar(String palavra) {
        List<String> letras = Arrays.asList(palavra.split(""));
        Collections.shuffle(letras);
        StringBuilder embaralhada = new StringBuilder();
        for (String letra : letras) {
            embaralhada.append(letra);
        }
        return embaralhada.toString();
    }
}