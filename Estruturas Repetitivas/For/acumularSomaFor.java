import java.util.Scanner;
public class acumularSomaFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int soma = 0;
        int n, x;

        System.out.printf("=> Quantas vezes o código irá repetir? ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("=> Informe um número para a soma: ");
            x = input.nextInt();
            
            soma += x;
        }

        System.out.printf("=> Soma: %d\n", soma);

        input.close();

    }
}
