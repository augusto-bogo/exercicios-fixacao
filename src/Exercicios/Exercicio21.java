package Exercicios;
import java.util.Random;

//Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

public class Exercicio21 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(101);
        System.out.println("Número inteiro aleatório: " + numeroAleatorio);
    }
}
