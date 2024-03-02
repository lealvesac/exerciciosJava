package exercicios_vetores.mais_velho;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas você irá informar: ");
        int num = input.nextInt();

        String[] nome = new String[num];
        int[] idade = new int[num];

        int maisVelha = idade[0];
        int posicaoVelha = 0;

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa: ");

            System.out.print("Nome: ");
            input.nextLine();
            nome[i] = input.nextLine();

            System.out.print("Idade: ");
            idade[i] = input.nextInt();

            if (idade[i] > maisVelha) {
                maisVelha = idade[i];
                posicaoVelha = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nome[posicaoVelha]);

        input.close();
    }
}
