package Exercicios;
import java.util.Scanner;

//Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

public class Exercicio06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite qualquer valor para ser reajustado a 5%: ");
    double valorUsuario = sc.nextDouble();

    double valorReajuste = valorUsuario * 1.05;

    System.out.printf("O valor reajustado é: %.2f%n", valorReajuste);

    sc.close();
    }
}
