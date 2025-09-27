package Exercicios;
import java.util.Scanner;

//Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite suas três notas para descobrir a sua média.");
        System.out.println("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é: %.2f%n", media);

        sc.close();
    }
}
