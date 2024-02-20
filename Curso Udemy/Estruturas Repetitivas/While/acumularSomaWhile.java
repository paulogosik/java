import java.util.Scanner;
public class acumularSomaWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;
        int soma = 0;

        System.out.printf("=> Digite um número qualquer: ");
        x = input.nextInt();

        while (x != 0) {
            soma += x;
            System.out.printf("=> Digite um número qualquer: ");
            x = input.nextInt();
        }

        System.out.printf("=> Soma: %d", soma);
        input.close();


    }
}
