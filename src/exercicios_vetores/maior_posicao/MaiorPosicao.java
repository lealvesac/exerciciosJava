package exercicios_vetores.maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar: ");
        int n = input.nextInt();

        double[] vectorNum = new double[n];

        double maiorValor = 0;
        int posicaoMaiorValor = 0;

        for (int i = 0; i < vectorNum.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vectorNum[i] = input.nextDouble();
            if (vectorNum[i] > maiorValor) {
                maiorValor = vectorNum[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f.%n", maiorValor);
        System.out.print("POSIÇÃO DE MAIOR VALOR = " + posicaoMaiorValor);


        input.close();
    }
}
