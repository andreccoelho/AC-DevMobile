package view;

import java.util.Scanner;
import control.CalculadoraIMC;


public class Programa {
    public static void main(String[] args) {
        // Cria uma instância da CalculadoraIMC
        CalculadoraIMC calculadora = new CalculadoraIMC();
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados de entrada ao usuário
        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu sexo (h para homem, m para mulher): ");
        String sexo = scanner.next();

        // Calcula o IMC com base nos dados fornecidos
        String resultado = calculadora.calcularImc(peso, altura, idade, sexo);

        // Exibe o resultado
        System.out.println("Resultado do IMC: " + resultado);

        // Fecha o scanner
        scanner.close();
    }
}