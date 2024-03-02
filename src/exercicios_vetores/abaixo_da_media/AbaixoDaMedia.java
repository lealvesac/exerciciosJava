package exercicios_vetores.abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int num = input.nextInt();

        double[] vector = new double[num];
        double somaDoVector = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vector[i] = input.nextDouble();
            somaDoVector += vector[i];
        }

        double mediaDoVector = somaDoVector / vector.length;

        System.out.printf("MÉDIA DO VETOR = %.3f.\n", mediaDoVector);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (double j : vector) {
            if (j < mediaDoVector) {
                System.out.printf("%.1f\n", j);
            }
        }


        input.close();
    }
}
