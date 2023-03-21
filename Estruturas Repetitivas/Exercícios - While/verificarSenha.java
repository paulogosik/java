import java.util.Scanner;
public class verificarSenha {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int senha;

        System.out.printf("=> Informe a senha: ");
        senha = input.nextInt();
        System.out.println("--------------------------");

        while (senha != 2002) {
            System.out.println("=> Senha Inválida!");
            System.out.printf("=> Informe a senha: ");
            senha = input.nextInt();
            System.out.println("--------------------------");
        }

        System.out.println("=> Acesso permitido.\n");

        input.close();

    }
}
