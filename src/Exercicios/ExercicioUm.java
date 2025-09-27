package Exercicios;
import java.util.Scanner;

//Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para o valor A: ");
        int valorA = sc.nextInt();
        System.out.println("Digite um número para o valor B: ");
        int valorB = sc.nextInt();
        System.out.println("Digite um número para o valor C: ");
        int valorC = sc.nextInt();

        int soma = valorA + valorB;

        System.out.println("A soma de A + B é: " + soma);

        if (soma < valorC){
            System.out.println("A soma dos valores A e B é menor que o C");
        }else{
            System.out.println("A soma dos valores A e B é maior que o C");
        }

        sc.close();
    }
}
