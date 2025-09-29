package Exercicios;
import java.util.Scanner;

/* Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7. */

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Digite sua quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.2f\n", media);

        if (media < 7){
            System.out.println("Situação: Reprovado.");
        }else{
            System.out.println("Situação: Aprovado.");
        }

        sc.close();
    }
}
