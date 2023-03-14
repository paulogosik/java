import java.util.Scanner;
public class entradaDeDados {
    public static void main(String[] args) {

        String nome;
        int idade;
        double salario;

        Scanner input = new Scanner(System.in);
        System.out.println("=> Qual é o seu nome? ");
        nome = input.nextLine();
        System.out.println("=> Quantos anos você tem? ");
        idade = input.nextInt();
        System.out.println("=> Qual o seu salário? ");
        salario = input.nextDouble();


        System.out.printf("=> Seu nome é %s, você tem %d anos e recebe R$%.2f por mês!", nome, idade, salario);
        input.close();

    }
    
}
