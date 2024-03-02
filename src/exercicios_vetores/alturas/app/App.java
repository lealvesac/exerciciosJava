package exercicios_vetores.alturas.app;

import exercicios_vetores.alturas.entidades.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Pessoa[] vectorPessoas;

        System.out.print("Quantas pessoas serão digitadas: ");
        int numPessoas = input.nextInt();

        vectorPessoas = new Pessoa[numPessoas];

        double soma = 0;
        double menorIdade = 0;

        for (int i = 0; i < vectorPessoas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa: ");

            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();

            System.out.print("Idade: ");
            int idade = input.nextInt();

            System.out.print("Altura: ");
            double altura = input.nextDouble();

            vectorPessoas[i] = new Pessoa(nome, idade, altura);
            soma += vectorPessoas[i].getAltura();

            if (vectorPessoas[i].getIdade() < 16 ) {
                menorIdade += 1;
            }

        }

        double porcentagem = (menorIdade / vectorPessoas.length) * 100;

        double media = soma / vectorPessoas.length;

        System.out.printf("Altura média: %.2f.%n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%.\n", porcentagem);

        for (int i = 0; i < vectorPessoas.length; i++) {
            if (vectorPessoas[i].getIdade() < 16) {
                System.out.println(vectorPessoas[i].getNome());
            }

        }
    }
}
