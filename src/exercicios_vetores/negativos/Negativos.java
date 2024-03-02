package exercicios_vetores.negativos;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?: ");
        int n = input.nextInt();

        int [] vectorNum = new int[n];

        for (int i = 0; i < vectorNum.length; i++) {
            System.out.print("Digite um numero: ");
            vectorNum[i] = input.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i = 0; i < vectorNum.length; i++) {
            if (vectorNum[i] < 0) {
                System.out.println(vectorNum[i]);
            }

        }


    }
}
