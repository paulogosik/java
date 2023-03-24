import java.util.Locale;
import java.util.Scanner;
public class exercicioDoWhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double c, f;
        char continuar;

        do {
            System.out.printf("=> Digite a temperatura em Celsius: ");
            c = input.nextDouble();

            f = ((9 * c) / 5) + 32;
            System.out.printf("=> Temperatura equivalente em Farenheit: %.1f\n", f);
            System.out.print("=> Deseja continuar? (s/n) ");
            continuar = input.next().charAt(0);
            System.out.println("----------------------------");

        } while (continuar != 'n');

        input.close();

    }
}
