package com.mycompany.nomeinvertido;
//Faça um programa que permita ao usuário digitar o seu nome e em seguida mostre o nome do usuário de trás para frente utilizando somente letras maiúsculas. Dica: lembre−se que ao informar o nome o usuário pode digitar letras maiúsculas ou minúsculas.
import java.util.Scanner;

public class NomeInvertido {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            
            
            String nomeMaiusculo = nome.toUpperCase();
            
            
            String nomeInvertido = new StringBuilder(nomeMaiusculo).reverse().toString();
            
            
            System.out.println("Nome invertido em maiúsculas: " + nomeInvertido);
        }
    }
}
