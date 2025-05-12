package com.mycompany.emprestimo;
//Faça um programa para aprovar empréstimos bancários. O código deve pedir três informações: valor do empréstimo, número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor das parcelas representem no máximo 30% do salário do solicitante.
import java.util.Scanner;

public class Emprestimo{

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Informe o valor do empréstimo: R$ ");
            double valorEmprestimo = scanner.nextDouble();
            
            System.out.print("Informe o número de parcelas: ");
            int numeroParcelas = scanner.nextInt();
            
            System.out.print("Informe o salário do solicitante: R$ ");
            double salario = scanner.nextDouble();
            
            
            double valorParcela = valorEmprestimo / numeroParcelas;
            
            
            double limite = salario * 0.30;
            
            
            System.out.println("\n===== ANÁLISE DO EMPRÉSTIMO =====");
            System.out.printf("Valor da parcela: R$ %.2f\n", valorParcela);
            System.out.printf("Limite máximo permitido (30%% do salário): R$ %.2f\n", limite);
            
            if (valorParcela <= limite) {
                System.out.println("✅ Empréstimo aprovado!");
            } else {
                System.out.println("❌ Empréstimo reprovado: parcelas acima de 30% do salário.");
            }
        }
    }
}
