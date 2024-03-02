package exercicios_vetores.soma_vetores;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor: ");
        int num = input.nextInt();

        int[] vectorA = new int[num];
        int[] vectorB = new int[num];
        int[] vectorSoma = new int[vectorA.length];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = input.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int j = 0; j < vectorB.length; j++) {
            vectorB[j] = input.nextInt();
        }

        for (int i = 0; i < vectorA.length; i++) {
            vectorSoma[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int valor : vectorSoma) {
            System.out.println(valor);
        }

        input.close();
    }
}
