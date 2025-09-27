package Exercicios;
import java.util.Scanner;

// Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

public class ExercicioQuatro {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sucessor;
    int antecessor;

    System.out.println("Digite um número inteiro: ");
    int numero = sc.nextInt();

    System.out.println("O número digitado é " + numero);
    System.out.println("Antecessor: " + (numero - 1));
    System.out.println("Sucessor: " + (numero + 1));
    sc.close();
    }
}
