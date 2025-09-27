package Exercicios;
import java.util.Scanner;

//Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número digitado é um número par.");
        }else{
            System.out.println("O número digitado é um número ímpar.");
        }

        if(numero > 0){
            System.out.println("O número digitado é um número positivo.");
        }else{
            System.out.println("O número digitado é um número negativo.");
        }
        sc.close();
    }
}
