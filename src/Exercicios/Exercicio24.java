package Exercicios;
import java.util.Scanner;

// Crie um programa que continue pedindo um nome até que o usuário insira um valor válido com pelo menos 3 caracteres.

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";

        while (nome.length() < 3){
            System.out.println("Digite um nome (mínimo 3 caracteres): ");
            nome = sc.nextLine();

            if (nome.length() < 3){
                System.out.println("Nome inválido, digite novamente!");
            }
        }
        System.out.println("Nome cadastrado com sucesso!");
        sc.close();
    }
}
