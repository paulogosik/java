package Exercícios;

import java.util.Scanner;
public class numerosMultiplos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2;
        
        System.out.printf("=> Informe um valor inteiro: ");
        n1 = input.nextInt();
        System.out.printf("=> Informe outro valor inteiro: ");
        n2 = input.nextInt();
        System.out.println("-----------------------------");

        if ( n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("=> São múltiplos.");
        } else {
            System.out.println("Não são múltiplos.");
        }

        input.close();

    }
}
