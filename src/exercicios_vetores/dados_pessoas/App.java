package exercicios_vetores.dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão informadas: ");
        int numPessoas = input.nextInt();

        DadosPessoas[] vectorDadosPessoas = new DadosPessoas[numPessoas];

        int numHomens = 0;
        int numMulheres = 0;

        double somaAlturaMulheres = 0;

        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
            double altura = input.nextDouble();
            System.out.print("Gênero da " + (i + 1) + "ª pessoa: ");
            char sexo = input.next().charAt(0);
            vectorDadosPessoas[i] = new DadosPessoas(altura, sexo);

            if (vectorDadosPessoas[i].getSexo() == 'F' || vectorDadosPessoas[i].getSexo() == 'f') {
                numMulheres += 1;
                somaAlturaMulheres += vectorDadosPessoas[i].getAltura();
            } else {
                numHomens += 1;
            }
        }

        double menorAltura = vectorDadosPessoas[0].getAltura();
        double maiorAltura = vectorDadosPessoas[0].getAltura();
        double mediaAlturaMulheres = somaAlturaMulheres / numMulheres;

        for (int i = 0; i < vectorDadosPessoas.length; i++) {
            if (vectorDadosPessoas[i].getAltura() > maiorAltura) {
                maiorAltura = vectorDadosPessoas[i].getAltura();
            }
            if (vectorDadosPessoas[i].getAltura() < menorAltura) {
                menorAltura = vectorDadosPessoas[i].getAltura();
            }
        }

        System.out.printf("Menor altura = %.2f.\n", menorAltura);
        System.out.printf("Maior altura = %.2f.\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f.\n", mediaAlturaMulheres);
        System.out.println("Numero de homens = " + numHomens);

        input.close();
    }
}
