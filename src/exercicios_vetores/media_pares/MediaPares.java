package exercicios_vetores.media_pares;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanto elementos vai ter o vetor: ");
        int num = input.nextInt();

        int[] vector = new int[num];

        int soma = 0, numLido = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vector[i] = input.nextInt();
            if (vector[i] % 2 == 0) {
                soma += vector[i];
                numLido += 1;
            }
        }

        double media = (double) soma / numLido;

        if (soma != 0) {
            System.out.printf("MÉDIA DOS PARES = %.1f.\n", media);
        } else {
            System.out.println("NENHUM NÚMERO PAR!");
        }

        input.close();
    }
}
