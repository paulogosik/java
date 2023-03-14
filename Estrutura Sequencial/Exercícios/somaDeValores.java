package Exercícios;

import java.util.Scanner;
public class somaDeValores {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a, b, soma;
        System.out.printf("=> Digite um valor inteiro: ");
        a = input.nextInt();
        System.out.printf("=> Digite outro valor inteiro: ");
        b = input.nextInt();
        System.out.println("-----------------------");

        soma = a + b;

        System.out.printf("A soma dos valores é: %d", soma);

        input.close();

    }
}
