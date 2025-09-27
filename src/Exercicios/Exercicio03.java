package Exercicios;
import java.util.Scanner;

/**Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.*/

public class Exercicio03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int c;

    System.out.println("Digite um número inteiro: ");
    int a = sc.nextInt();

    System.out.println("Digite outro número inteiro: ");
    int b = sc.nextInt();

    if (a == b){
        c = a + b;
        System.out.println("A soma dos dois números é: " + c);
    }else{
        c = a * b;
        System.out.println("A multiplicação dos dois números é: " + c);
    }
    sc.close();
    }
}
