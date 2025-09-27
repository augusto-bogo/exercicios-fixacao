package Exercicios;
import java.util.Arrays;
import java.util.Scanner;

//Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[3];

        System.out.println("Digite o primeiro valor inteiro: ");
        valores[0] = sc.nextInt();


        System.out.println("Digite o segundo valor inteiro: ");
        valores[1] = sc.nextInt();


        System.out.println("Digite o terceiro valor inteiro: ");
        valores[2] = sc.nextInt();

        Arrays.sort(valores);

        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.print(valores[i] + " ");
        }
        sc.close();
    }
}
