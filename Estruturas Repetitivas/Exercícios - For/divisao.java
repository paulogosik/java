import java.util.Scanner;
import java.util.Locale;

public class divisao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int n;
        double n1 = 0;
        double n2 = 0;
        double div = 0;

        System.out.printf("=> Informe o número de repetições: ");
        n = input.nextInt();
        System.out.println("-------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("=> Digite o primeiro número: ");
            n1 = input.nextDouble();
            System.out.printf("=> Digite o segundo número: ");
            n2 = input.nextDouble();

            if (n2 == 0) {
                System.out.println("=> Divisão impossível");
                System.out.println("-------------------------");
            }
            else {
                div = n1 / n2;
                System.out.printf("=> Divisão: %.1f\n", div);
                System.out.println("-------------------------");
            }
        }

        input.close();

    }
}
