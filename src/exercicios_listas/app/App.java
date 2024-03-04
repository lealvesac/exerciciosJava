package exercicios_listas.app;

import exercicios_listas.funcionario.Funcionario;
import static exercicios_listas.funcionario.Funcionario.buscaId;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Funcionario> funcionario = new ArrayList<>();

        System.out.print("Quantos funcionários deseja registrar?: ");
        int x = input.nextByte();


        //LEITURA DOS DADOS
        for (int i = 0; i < x; i++) {

            System.out.println("Funcionário #" + (i + 1));

            System.out.print("ID: ");
            int id = input.nextInt();

            //VERIFICAR SE O ID JA EXISTE NA LISTA
            do {
                if (buscaId(funcionario, id)) {
                    System.out.print("O ID já está em uso, informe outro: ");
                    id = input.nextInt();
                }
            } while (buscaId(funcionario, id));

            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();

            System.out.print("Salário: R$");
            double salario = input.nextDouble();

            funcionario.add(new Funcionario(id, nome, salario));
        }

        //ATUALIZAÇÃO DE SALARIO.

        System.out.println();
        System.out.print("Informe o ID do funcionário que deseja aumentar o salario: ");
        int id = input.nextInt();

        Funcionario idFuncionario = funcionario.stream().filter(y -> y.getId() == id).findFirst().orElse(null);
        if (idFuncionario == null) {
                System.out.println("Esse funcionário não existe!");
        } else {
            System.out.print("Informe a porcentagem: ");
            double porcentagem = input.nextDouble();
            idFuncionario.aumentarSalario(porcentagem);
        }

        //LISTAGEM DE FUNCIONÁRIOS

        System.out.println();
        System.out.println("LISTA DE FUNCIONÁRIOS: ");
        for (Funcionario obj : funcionario) {
            System.out.println(obj);
        }

        input.close();
    }

    //MÉTODO PARA BUSCA NA LISTA

}
