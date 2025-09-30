package Exercicios;
import java.util.Scanner;

// Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o um número inteiro para descobrir a tabuada: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada do " + numero);

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        sc.close();
    }
}
