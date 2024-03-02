package exercicios_vetores.aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos serão informados: ");
        int numAlunos = input.nextInt();

        String[] nomeAluno = new String[numAlunos];
        double[] priSemestre = new double[numAlunos];
        double[] segSemestre = new double[numAlunos];
        double[] somaNotas = new  double[numAlunos];

        for (int i = 0; i < nomeAluno.length; i++) {
            System.out.println("Digite Nome, Primeira e Segunda nota do " + (i + 1) + "ª aluno:");
            input.nextLine();
            nomeAluno[i] = input.nextLine();
            priSemestre[i] = input.nextDouble();
            segSemestre[i] = input.nextDouble();
            somaNotas[i] = priSemestre[i] + segSemestre [i];
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < nomeAluno.length; i++) {
            if (somaNotas[i] / 2 >= 6.0) {
                System.out.println(nomeAluno[i]);
            }
        }

        input.close();
    }
}
