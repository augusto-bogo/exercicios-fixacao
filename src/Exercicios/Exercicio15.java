package Exercicios;
import java.time.Instant;
import java.util.Calendar;
import java.util.Scanner;

/* Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos a pessoa tem. */

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("Digite em que ano você nasceu: ");
        int anoNascimento = sc.nextInt();

        int anos = anoAtual - anoNascimento;

        System.out.println("Você tem: " + anos + " anos");

        sc.close();
    }
}
