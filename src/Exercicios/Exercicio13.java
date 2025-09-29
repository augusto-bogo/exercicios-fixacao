package Exercicios;
import java.util.Scanner;

// Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 18){
            System.out.println("Olá " + nome + ", você é menor de idade.");
        }else{
            System.out.println("Olá " + nome + ", você é maior de idade.");
        }

        sc.close();
    }
}
