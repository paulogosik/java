import java.util.Scanner;
public class entradaDeDados {
    public static void main(String[] args) {

        String nome;
        int idade;

        Scanner input = new Scanner(System.in);
        System.out.println("=> Qual é o seu nome? ");
        nome = input.nextLine();
        System.out.println("=> Quantos anos você tem?");
        idade = input.nextInt();

        System.out.printf("=> Seu nome é %se você tem %d anos!", nome, idade);

    }
    
}
