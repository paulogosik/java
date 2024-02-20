package Exercícios;

import java.util.Locale;
import java.util.Scanner;
public class calcularAreas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        System.out.printf("=> Valor de A: ");
        a = input.nextDouble();
        System.out.printf("=> Valor de B: ");
        b = input.nextDouble();
        System.out.printf("=> Valor de C: ");
        c = input.nextDouble();
        System.out.println("--------------------");

        triangulo = a * c / 2.0;
		circulo = 3.14159 * c * c;
		trapezio = (a + b) / 2.0 * c;
		quadrado = b * b;
		retangulo = a * b;

        System.out.printf("=> Triângulo: %.3f\n", triangulo);
        System.out.printf("=> Círculo: %.3f\n", circulo);
        System.out.printf("=> Trapézio: %.3f\n", trapezio);
        System.out.printf("=> Quadrado: %.3f\n", quadrado);
        System.out.printf("=> Retângulo: %.3f\n", retangulo);

        input.close();

    }
}
