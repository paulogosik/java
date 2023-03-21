import java.util.Scanner;
public class diferentesDeZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;

        System.out.printf("=> Digite um número qualquer: ");
        x = input.nextInt();

        while (x != 0) {
            System.out.printf("=> Digite um número qualquer: ");
            x = input.nextInt();
        }

        input.close();

    }
}