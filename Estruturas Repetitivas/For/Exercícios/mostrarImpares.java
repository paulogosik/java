import java.util.Scanner;
public class mostrarImpares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;

        System.out.printf("=> Informe um valor X: ");
        x = input.nextInt();

        for (int i = 1; i <= x; i = i + 2) {
            System.out.println(i);
        }

        input.close();

    }
}
