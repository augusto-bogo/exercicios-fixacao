package Exercicios;
import java.util.Scanner;

//Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor lógico (true/false): ");
        boolean valor1 = sc.nextBoolean();

        System.out.println("Digite o segundo valor lógico (true/false): ");
        boolean valor2 = sc.nextBoolean();

        if(valor1 && valor2){
            System.out.println("Verdadeiro.");
        } else {
            System.out.println("Falso.");
        }
    }
}
