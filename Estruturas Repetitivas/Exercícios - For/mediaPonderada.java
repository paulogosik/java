import java.util.Scanner;
import java.util.Locale;
public class mediaPonderada {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int n;
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double media = 0;

        System.out.printf("=> Informe o número de repetições: ");
        n = input.nextInt();
        System.out.println("------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("=> Informe o número 1: ");
            n1 = input.nextDouble();
            System.out.printf("=> Informe o número 2: ");
            n2 = input.nextDouble();
            System.out.printf("=> Informe o número 3: ");
            n3 = input.nextDouble();

            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

            System.out.printf("=> Média ponderada: %.1f\n", media);
            System.out.println("------------------------------");
        }

        input.close();

    }
}
