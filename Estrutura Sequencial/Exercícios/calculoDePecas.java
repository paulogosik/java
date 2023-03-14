package Exercícios;

import java.util.Scanner;
import java.util.Locale;
public class calculoDePecas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String code1, code2;
        double num1, num2, value1, value2, total;

        System.out.println("=={ PEÇA 1 }==");
        System.out.printf("=> Código: ");
        code1 = input.next();
        System.out.printf("=> Número de peças adquiridas: ");
        num1 = input.nextDouble();
        System.out.printf("=> Valor unitário da das peças: ");
        value1 = input.nextDouble();
        System.out.println("=={ PEÇA 2 }==");
        System.out.printf("=> Código: ");
        code2 = input.next();
        System.out.printf("=> Número de peças adquiridas: ");
        num2 = input.nextDouble();
        System.out.printf("=> Valor unitário da das peças: ");
        value2 = input.nextDouble();
        System.out.println("-----------------------------");

        total = (num1 * value1) + (num2 * value2);
        System.out.printf("=> Valor a pagar: R$%.2f", total);

        input.close();

    }
}
