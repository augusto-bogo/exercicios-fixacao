package Exercicios;
import java.util.Scanner;

/*Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20). */


public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMinimoBase = 1293.20;

        System.out.println("Digite seu salário: ");
        double salarioUsuario = sc.nextDouble();

        double qtdeSalario = salarioUsuario / salarioMinimoBase;

        System.out.printf("Você recebe aproximadamente %.2f salários mínimos.%n", qtdeSalario);
        sc.close();
    }
}
