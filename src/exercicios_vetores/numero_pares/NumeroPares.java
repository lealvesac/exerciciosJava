package exercicios_vetores.numero_pares;

import java.util.Scanner;

public class NumeroPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar: ");
        int num = input.nextInt();

        int[] vectorNum = new int[num];

        int pares = 0;

        for (int i = 0; i < vectorNum.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vectorNum[i] = input.nextInt();
        }

        System.out.println("NúMEROS PARES:");
        for (int j : vectorNum) {
            if (j % 2 == 0) {
                pares += 1;
                System.out.print(j + " ");
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + pares);

        input.close();
    }
}
