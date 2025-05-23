package com.mycompany.crescimentopopulacional;
//Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200.000 habitantes com uma taxa de crescimento de 1,5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
public class CrescimentoPopulacional {

    public static void main(String[] args) {
        
        int populacaoA = 80000;  
        int populacaoB = 200000; 

        
        double taxaA = 0.03;  
        double taxaB = 0.015;

       
        int anos = 0;

        
        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaA; 
            populacaoB += populacaoB * taxaB; 
            anos++; 
        }

      
        System.out.println("Quantidade de anos necessários: " + anos);
        System.out.println("População do país A: " + populacaoA);
        System.out.println("População do país B: " + populacaoB);
    }
}
