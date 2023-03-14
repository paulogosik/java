package Exercícios;

import java.util.Scanner;
import java.util.Locale;
public class calculoRaioDoCirculo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double pi, r, area;
        pi = 3.14159;

        System.out.printf("=> Digite o valor do raio de um círculo: ");
        r = input.nextDouble();

        input.close();

    }
}
