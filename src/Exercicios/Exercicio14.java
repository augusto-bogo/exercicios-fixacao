package Exercicios;
import java.util.Scanner;

/*  Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores. */

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int auxiliar;

        System.out.println("Digite um valor inteiro: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite outro valor inteiro: ");
        int valor2 = sc.nextInt();

        auxiliar = valor1;
        valor1 = valor2;
        valor2 = auxiliar;

        System.out.println("Após a troca:");
        System.out.println("Valor de A: " + valor1);
        System.out.println("Valor de B: " + valor2);

        sc.close();
    }
}
