package exercicio01.application;

import exercicio01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle;
        rectangle = new Rectangle();

        System.out.print("Informe a Largura do Retângulo: ");
        rectangle.width = scanner.nextDouble();
        System.out.print("Informe a Altura do Retângulo: ");
        rectangle.height = scanner.nextDouble();

        System.out.printf("A área do Retângulo é: %.2f.%n", rectangle.Area());
        System.out.printf("O Perímetro do Retângulo é: %.2f.%n", rectangle.Perimeter());
        System.out.printf("A Diagonal do Retângulo é: %.2f.%n", rectangle.Diagonal());

        scanner.close();
    }
}
