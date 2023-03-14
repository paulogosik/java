package Exercícios;

import java.util.Scanner;
public class numeroParOuImpar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;

        System.out.printf("=> Informe um número inteiro: ");
        x = input.nextInt();
        System.out.println("------------------------");

        if (x % 2 == 0) {
            System.out.println("=> Número par!");
        } else {
            System.out.println("=> Número ímpar!");
        }

        input.close();

    }
}
