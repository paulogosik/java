import java.util.Scanner;
public class inOrOut {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, x;
        int somaIn = 0;
        int somaOut = 0;

        System.out.printf("=> Informe um número para repetições: ");
        n = input.nextInt();
        System.out.println("-----------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("=> Informe um número: ");
            x = input.nextInt();

            if (x >= 10 && x <= 20) {
                somaIn += 1;
            }
            else {
                somaOut += 1;
            }
        }

        System.out.println("-----------------------");
        System.out.printf("=> %d in\n", somaIn);
        System.out.printf("=> %d out\n", somaOut);

        input.close();

    }
}
