package Exercícios;

import java.util.Scanner;
import java.util.Locale;
public class calculoSalario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String number;
        int hours;
        double value, salary;

        System.out.printf("=> Qual é o seu número? ");
        number = input.nextLine();
        System.out.printf("=> Qual foi a quantidade de horas trabalhadas? ");
        hours = input.nextInt();
        System.out.printf("=> Qual o valor que você recebe por hora? ");
        value = input.nextDouble();
        System.out.println("-----------------------------");

        salary = value * hours;

        System.out.printf("=> Número: %s\n", number);
        System.out.printf("=> Salary: U$%.2f\n", salary);

        input.close();

    }
}
