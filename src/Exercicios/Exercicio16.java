package Exercicios;
import java.util.Scanner;

/* Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
equilátero, isósceles ou escaleno. */

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        double primeiroLado = sc.nextDouble();

        System.out.println("Digite o segundo lado: ");
        double segundoLado = sc.nextDouble();

        System.out.println("Digite o terceiro lado: ");
        double terceiroLado = sc.nextDouble();

        if (primeiroLado == segundoLado && segundoLado == terceiroLado){
            System.out.println("Triângulo equilátero.");
        } else if (primeiroLado != segundoLado && segundoLado != terceiroLado && primeiroLado != terceiroLado){
            System.out.println("Triângulo escaleno.");
        }else {
            System.out.println("Triângulo isósceles.");
        }
        sc.close();
    }
}
