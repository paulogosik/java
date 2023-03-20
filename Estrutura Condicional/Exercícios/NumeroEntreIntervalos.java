package Exercícios;

import java.util.Scanner;
import java.util.Locale;
public class NumeroEntreIntervalos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double number;

        System.out.printf("=> Digite um número qualquer: ");
        number = input.nextDouble();
        System.out.println("----------------------------");

        if (number >= 0 && number <= 25){
            System.out.printf("=> Intervalo (0, 25)");
        } 
        else if (number > 25 && number <= 50) {
            System.out.printf("=> Intervalo (25, 50)");
        } 
        else if (number > 50 && number <= 75) {
            System.out.printf("=> Intervalo (50, 75)");
        }
        else if (number > 75 && number <= 100) {
            System.out.printf("=> Intervalo (75, 100)");
        }
        else {
            System.out.printf("=> Fora de intervalo.");
        }

        input.close();

    }
}
