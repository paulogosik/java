package TriangleAreas;
import java.util.Scanner;
import java.util.Locale;
// Precisamos importar a classe do pacote 'Entities' para usar uma classe de um outro arquivo no 'Main.java'
import TriangleAreas.Entities.Triangle;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // Quando usamos o 'new' em 'new Triangle()' estamos dizendo que a variável está apontado para o objeto
        // Quando a variável está declarada com o 'new', novos objetos estão sendo alocados
        // Também quando usamos o 'new' estamos instanciando um novo objeto da classe
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.printf("=> Inform the 1° side of a X triangle: ");
        // Em 'x.a' o 'a' é um atributo da variável 'x', que se tornou um objeto
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

        double areaX = x.Area();
        double areaY = y.Area();

        System.out.println("---------------------------------------");
        System.out.printf("=> Triangle X area: %.2f \n", areaX);
        System.out.printf("=> Triangle Y area: %.2f \n", areaY);

        if (areaX > areaY) {
            System.out.println("=> Larger area: X");
        } else {
            System.out.println("=> Larger area: Y");
        }

        input.close();
    }
}