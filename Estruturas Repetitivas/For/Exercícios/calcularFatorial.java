import java.util.Scanner;
public class calcularFatorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int fat = 1;

        System.out.printf("=> Diga um número inteiro qualquer: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            fat = fat * i;
            System.out.println(fat);
        }

        System.out.printf("=> Fatorial: %d", fat);

        input.close();

    }
}
