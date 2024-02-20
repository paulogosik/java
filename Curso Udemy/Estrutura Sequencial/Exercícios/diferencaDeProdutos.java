package Exercícios;

import java.util.Scanner;
public class diferencaDeProdutos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c, d, diferenca;

        System.out.printf("=> Digite um valor inteiro de A: ");
        a = input.nextInt();
        System.out.printf("=> Digite um valor inteiro de B: ");
        b = input.nextInt();
        System.out.printf("=> Digite um valor inteiro de C: ");
        c = input.nextInt();
        System.out.printf("=> Digite um valor inteiro de D: ");
        d = input.nextInt();
        System.out.println("--------------------------------");

        diferenca = (a * b - c * d);
        System.out.printf("=> A diferença dos produtos é igual a: %d", diferenca);

        input.close();

    }
}
