package Exercicios;
import java.util.Scanner;

/* Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
Fórmula: C = (5 * ( F-32) / 9) */

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperatura = sc.nextDouble();

        System.out.println("A temperatura em Fahrenheit é " + temperatura + ", convertendo para Celsius é: " + (temperatura - 32) / 1.8);

        sc.close();
    }
}
