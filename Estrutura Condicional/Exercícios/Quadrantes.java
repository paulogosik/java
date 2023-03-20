package Exercícios;

import java.util.Scanner;
import java.util.Locale;
public class Quadrantes {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double x, y;

        System.out.printf("=> Informe o valor x: ");
        x = input.nextDouble();
        System.out.printf("=> Informe o valor y: ");
        y = input.nextDouble();
        System.out.println("-------------------------------");

        if (x == 0 && y != 0){
            System.out.println("=> Eixo X");
        }
        else if (x != 0 && y == 0) {
            System.out.println("=> Eixo Y");
        }
        else if (x > 0 && y > 0) {
            System.out.println("=> Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("=> Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("=> Q3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("=> Q4");
        }
        else {
            System.out.println("=> Origem");
        }

        input.close();

    }
    
}
