package exercicios_vetores.soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?: ");
        int n = input.nextInt();

        double[] vectorNum = new double[n];

        double soma = 0;


        for (int i = 0; i < vectorNum.length; i++) {
            System.out.print("Digite um numero: ");
            vectorNum[i] = input.nextDouble();
            soma += vectorNum[i];
        }

        double media = soma / vectorNum.length;

        System.out.print("VALORES = ");

        for (int i = 0; i < vectorNum.length; i++) {
            System.out.printf("%.2f " , vectorNum[i]);
        }
        System.out.printf("\nSOMA = %.2f%n" , soma);
        System.out.printf("MEDIA = %.2f" , media);
    }
}
