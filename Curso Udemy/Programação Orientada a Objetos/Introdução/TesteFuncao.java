import java.util.Scanner;

public class TesteFuncao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("=> Informe um número: ");
        int num1 = input.nextInt();
        System.out.printf("=> Informe outro número: ");
        int num2 = input.nextInt();
        System.out.printf("=> Informe mais um número: ");
        int num3 = input.nextInt();

        System.out.println("-----------------------------");

        int higher = MaxNumber(num1, num2, num3);
        Resultado(higher);

        input.close();
    }

    public static int MaxNumber(int x, int y, int z) {
        int higher;

        if (x > y && x > z) {
            higher = x;
        }
        else if (y > z) {
            higher = y;
        }
        else {
            higher = z;
        }
        return higher;
    }
    
    public static void Resultado(int valor) {
        System.out.printf("=> O maior número é: %d", valor);
    }
}
