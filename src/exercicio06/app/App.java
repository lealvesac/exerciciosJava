package exercicio06.app;

import exercicio06.entidades.ContaCorrente;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        ContaCorrente contaCorrente;

        System.out.print("Entre com o numero da conta: ");
        int numeroConta = input.nextInt();
        System.out.print("Informe o nome do titular da conta: ");
        input.nextLine();
        String nomeTitular = input.nextLine();
        System.out.print("Deseja informar deposito inicial (y / n)?: ");
        char resposta = input.next().charAt(0);

        if (resposta == 'y') {
            System.out.print("Informe o valor do deposito inicial: R$");
            double depositoInicial = input.nextDouble();
            contaCorrente = new ContaCorrente(numeroConta, nomeTitular, depositoInicial);

        } else {
            contaCorrente = new ContaCorrente(numeroConta, nomeTitular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(contaCorrente);

        System.out.print("Entre com o valor de um novo deposito: R$");
        double deposito = input.nextDouble();
        contaCorrente.depositarConta(deposito);
        System.out.println("Dados da conta atualizados:");
        System.out.println(contaCorrente);

        System.out.print("Entre com o valor de saque: R$");
        double saque = input.nextDouble();
        contaCorrente.sacarContar(saque);
        System.out.println("Dados da conta atualizados:");
        System.out.println(contaCorrente);

        System.out.print("Deseja alterar o nome do titular da conta (y / n)?: ");
        input.nextLine();
        resposta = input.next().charAt(0);

        if (resposta == 'y') {
            System.out.print("Informe o nome do noto titular: ");
            input.nextLine();
            String novoNome = input.nextLine();
            contaCorrente.setTitularConta(novoNome);
            System.out.println("Dados da conta atualizados:");
            System.out.println(contaCorrente);
        }


        input.close();

    }
}
