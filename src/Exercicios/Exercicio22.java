package Exercicios;
import java.util.Scanner;

// Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro: ");
        int valorA = sc.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        int valorB = sc.nextInt();

        System.out.println("O quociente dos dois valores informados é: " + valorA / valorB);
        System.out.println("O resto da divisão dos dois valores informados é: " + valorA % valorB);

        sc.close();
    }
}
