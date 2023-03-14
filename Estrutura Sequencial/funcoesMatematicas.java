import java.util.Scanner;
import java.util.Locale;
public class funcoesMatematicas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("============================");
        System.out.println("FUNÇÕES: ");
        System.out.println("A = Math.sqrt(x); -> Raiz Quadrada");
        System.out.println("A = Math.pow(x, y); -> X elevado a Y");
        System.out.println("A = Math.abs(x); -> Valor Absoluto");
        System.out.println("============================\n\n");

        double a, b;

        System.out.println("============================");
        System.out.printf("=> Digite um valor: ");
        a = input.nextDouble();
        System.out.printf("=> Digite outro valor: ");
        b = input.nextDouble();
        System.out.println("============================");

        System.out.printf("=> Raiz quadrada de %.1f: %.2f\n", a, Math.sqrt(a));
        System.out.printf("=> Raiz quadrada de %.1f: %.2f\n", b, Math.sqrt(b));
        System.out.printf("=> %.1f elevado a %.1f: %.2f\n", a, b, Math.pow(a, b));
        System.out.printf("=> %.1f elevado a %.1f: %.2f\n", b, a, Math.pow(b, a));

        input.close();

    }
}
