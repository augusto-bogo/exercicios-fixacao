package Exercicios;
import java.util.Scanner;

// Crie um programa que conte de 1 até um número digitado pelo usuário, mas ignore números terminados em 5.

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            if (i % 10 == 5){
                continue;
            }
            System.out.println(i);
        }
        sc.close();
    }
}
