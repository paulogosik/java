import java.util.Scanner;
public class quadradoECubo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        System.out.printf("=> Informe um número inteiro e positvo: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            p1 = i;
            p2 = i * i;
            p3 = i * i * i;
            System.out.printf("=> %d %d %d\n", p1, p2, p3);
        }

        input.close();

    }
}