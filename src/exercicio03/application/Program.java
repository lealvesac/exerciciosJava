package exercicio03.application;

import exercicio03.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Informe o nome do aluno: ");
        student.name = input.nextLine();
        System.out.print("Informe a primeira nota: ");
        student.score1 = input.nextDouble();
        System.out.print("Informe a segunda nota: ");
        student.score2 = input.nextDouble();
        System.out.print("Informe a terceira nota: ");
        student.score3 = input.nextDouble();

        System.out.printf("Média final: %.2f.%n", student.mediaScore());

        if (student.mediaScore() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f.%n", student.testScore());
        }
        else {
            System.out.println("PASS");
        }

        input.close();
    }
}
