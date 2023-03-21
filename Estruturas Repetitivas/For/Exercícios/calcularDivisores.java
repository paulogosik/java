import java.util.Scanner;
public class calcularDivisores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.printf("=> Informe um número qualquer: ");
        n = input.nextInt();
        System.out.println("------------------------------");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("=> Divisível: %d\n", i);
            }
        }

        input.close();

    }
}
