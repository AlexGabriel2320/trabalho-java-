package com.mycompany.iniciaisnome;
//Escreva um programa que, a partir de um nome informado pelo usuário, exiba suas iniciais. As iniciais são formadas pela primeira letra de cada nome, sendo que todas deverão aparecer em maiúsculas na saída do programa. Note que os conectores e, do, da, dos, das, de, di, du não são considerados nomes e, portanto, não devem ser considerados para a obtenção das iniciais. As iniciais devem ser impressas em maiúsculas, ainda que o nome seja entrado todo em minúsculas.
import java.util.Scanner;

public class IniciaisNome {

    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
           
            String[] conectores = { "e", "do", "da", "dos", "das", "de", "di", "du" };
            
            System.out.print("Digite seu nome completo: ");
            String nomeCompleto = scanner.nextLine().toLowerCase(); // ignora maiúsculas/minúsculas
            
            String[] palavras = nomeCompleto.split(" ");
            StringBuilder iniciais = new StringBuilder();
            
            for (String palavra : palavras) {
                boolean ignorar = false;
                
               
                for (String con : conectores) {
                    if (palavra.equals(con)) {
                        ignorar = true;
                        break;
                    }
                }
                
                if (!ignorar && !palavra.isEmpty()) {
                    iniciais.append(Character.toUpperCase(palavra.charAt(0)));
                }
            }
            
            System.out.println("Iniciais: " + iniciais.toString());
        }
    }
}
