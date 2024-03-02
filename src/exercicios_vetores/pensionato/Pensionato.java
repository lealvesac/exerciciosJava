package exercicios_vetores.pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Cadastros[] cadastros = new Cadastros[10];

        System.out.print("Quantos quartos serão alugados: ");
        int numEstudantes = input.nextInt();


        for (int i = 0; i < numEstudantes; i++) {
            System.out.println();
            System.out.println("Aluguel #" + (i + 1) + ":");

            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();

            System.out.print("Email: ");
            String emails = input.next();

            System.out.print("Quarto: ");
            int numeroQuarto = input.nextInt();

            cadastros[numeroQuarto] = new Cadastros(nome,emails);

        }

        System.out.println();
        System.out.println("QUARTOS OCUPADOS: ");
        for (int i = 0; i < cadastros.length; i++) {
            if (cadastros[i] != null) {
            System.out.println(i + ": " + cadastros[i]);
        }
        }

        input.close();
    }
}
