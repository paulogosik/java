import java.util.Scanner;
public class planoCartesiano {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.println("---------------------------");
        System.out.printf("=> Informe o ponto X: ");
        x = input.nextInt();
        System.out.printf("=> Informe o ponto Y: ");
        y = input.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("=> Primeiro quadrante");
            }
            else if (x < 0 && y > 0) {
                System.out.println("=> Segundo quadrante");
            }
            else if (x < 0 && y < 0) {
                System.out.println("=> Terceiro quadrante");
            }
            else if (x > 0 && y < 0) {
                System.out.println("=> Quarto quadrante");
            }

            System.out.println("---------------------------");
            System.out.printf("=> Informe o ponto X: ");
            x = input.nextInt();
            System.out.printf("=> Informe o ponto Y: ");
            y = input.nextInt();
        }

        input.close();

    }
}
