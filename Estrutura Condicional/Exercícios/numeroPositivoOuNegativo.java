package Exercícios;

import java.util.Scanner;
public class numeroPositivoOuNegativo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;

        System.out.printf("=> Digite um número inteiro: ");
        x = input.nextInt();
        System.out.println("-------------------------");

        if (x >= 0) {
            System.out.println("Não negativo!");
        } else {
            System.out.println("Negativo!");
        }

        input.close();

    }
}
