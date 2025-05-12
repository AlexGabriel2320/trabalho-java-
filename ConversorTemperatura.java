package com.mycompany.conversortemperatura;
import java.util.Scanner;
//Faça um programa com duas funções, uma que recebe uma temperatura em Fahrenheit e retorna em Celcius e outra que faz o inverso. Lembrando que as fórmulas são ℃ = (℉ - 32) ÷ 1,8 e ℉ = ℃ × 1,8 + 32.
public class ConversorTemperatura {

    
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

   
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;
            
            do {
                System.out.println("\n=== Conversor de Temperaturas ===");
                System.out.println("1. Converter Fahrenheit para Celsius");
                System.out.println("2. Converter Celsius para Fahrenheit");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Digite a temperatura em Fahrenheit: ");
                        double fahrenheit = scanner.nextDouble();
                        double celsius = fahrenheitParaCelsius(fahrenheit);
                        System.out.printf("%.2f°F equivalem a %.2f°C%n", fahrenheit, celsius);
                    }
                    case 2 -> {
                        System.out.print("Digite a temperatura em Celsius: ");
                        double celsius = scanner.nextDouble();
                        double fahrenheit = celsiusParaFahrenheit(celsius);
                        System.out.printf("%.2f°C equivalem a %.2f°F%n", celsius, fahrenheit);
                    }
                    case 0 -> System.out.println("Encerrando o programa.");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);
        }
    }
}

