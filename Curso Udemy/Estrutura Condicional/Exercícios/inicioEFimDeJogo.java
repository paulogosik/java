package Exercícios;

import java.util.Scanner;
public class inicioEFimDeJogo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int hI, hF;

        System.out.printf("=> Coloque a hora inicial do jogo: ");
        hI = input.nextInt();
        System.out.printf("=> Coloque a hora final do jogo: ");
        hF = input.nextInt();
        System.out.println("--------------------------------");

        if (hI == hF) {
            System.out.println("=> O jogo durou 24 hora(s)");
        }
        else if (hI > hF) {
            int hP = hF + 24;
            int hD = hP - hI;
            System.out.printf("=> O jogo durou %d hora(s)", hD);
        }
        else {
            int hD = hF - hI;
            System.out.printf("=> O jogo durou %d hora(s)", hD);
        }

        input.close();

    }
}
