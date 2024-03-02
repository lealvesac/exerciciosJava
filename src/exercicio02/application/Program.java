package exercicio02.application;

import exercicio02.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Employee employee;
        employee = new Employee();

        System.out.print("Informe o nome do funcionário: ");
        employee.name = input.nextLine();

        System.out.print("Informe o valor do salário bruto: R$ ");
        employee.grossSalary = input.nextDouble();

        System.out.print("Informe o valor do imposto: R$ ");
        employee.tax = input.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + employee);
        System.out.print("Qual a porcentagem para acrescentar ao salário?: ");
        double upd = input.nextDouble();
        employee.increaseSalary(upd);
        System.out.println("Salário atualizado: " + employee);
    }
}
