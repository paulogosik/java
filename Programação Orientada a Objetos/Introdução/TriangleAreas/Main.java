package TriangleAreas;
import java.util.Scanner;
import java.util.Locale;
import TriangleAreas.Entities;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Entities x, y;
        x = new Entities();
        y = new Entities();

        System.out.printf("=> Inform the 1° side of a X triangle: ");
        x.a = input.nextDouble();
        System.out.printf("=> Inform the 2° side of a X triangle: ");
        x.b = input.nextDouble();
        System.out.printf("=> Inform the 3° side of a X triangle: ");
        x.c = input.nextDouble();

        System.out.println("---------------------------------------");

        System.out.printf("=> Inform the 1° side of a Y triangle: ");
        y.a = input.nextDouble();
        System.out.printf("=> Inform the 2° side of a Y triangle: ");
        y.b = input.nextDouble();
        System.out.printf("=> Inform the 3° side of a Y triangle: ");
        y.c = input.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        input.close();
    }
}