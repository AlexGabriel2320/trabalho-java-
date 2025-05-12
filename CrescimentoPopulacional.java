package com.mycompany.crescimentopopulacional;

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
