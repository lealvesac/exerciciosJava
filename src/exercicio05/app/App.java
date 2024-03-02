package exercicio05.app;

import exercicio05.entidades.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Alunos aluno = new Alunos();

        System.out.print("Entre com o nome do Aluno: ");
        aluno.nome = input.next();

        System.out.print("Entre com o nome do curso: ");
        aluno.nomeCurso = input.next();

        System.out.print("Entre com a matrícula: ");
        aluno.matricula = input.next();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.print("Informe a " + (i + 1) + "ª disciplina: ");
            aluno.nomeDisciplinas[i] = input.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i] +".");
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.print("Informe a " + (j + 1) + "ª nota: ");
                aluno.notasDisciplinas[i][j] = input.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - APROVADO!");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - REAPROVADO!");
            }
        }

        input.close();

    }
}
