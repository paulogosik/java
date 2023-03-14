package Exercícios;

import java.util.Scanner;
import java.util.Locale;
public class precoDeProdutos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int codigo;
        double quantidade;

        System.out.println("=> Produto: Cód. 1 - Cachorro Quente (R$4.00)");
        System.out.println("=> Produto: Cód. 2 - X-Salada (R$4.50)");
        System.out.println("=> Produto: Cód. 3 - X-Bacon (R$5.00)");
        System.out.println("=> Produto: Cód. 4 - Torrada Simples (R$2.00)");
        System.out.println("=> Produto: Cód. 5 - Refrigerante (R$2.00)");
        System.out.printf("=> Código: ");
        codigo = input.nextInt();
        System.out.printf("=> Quantidade: ");
        quantidade = input.nextInt();
        System.out.println("------------------------------------");

        if (codigo == 1) {
            double valor = 4 * quantidade;
            System.out.printf("=> Total: R$%.2f", valor);
        } else if (codigo == 2) {
            double valor = 4.5 * quantidade;
            System.out.printf("=> Total: R$%.2f", valor);
        } else if (codigo == 3) {
            double valor = 5 * quantidade;
            System.out.printf("=> Total: R$%.2f", valor);
        } else if (codigo ==4) {
            double valor = 2 * quantidade;
            System.out.printf("=> Total: R$%.2f", valor);
        } else if (codigo == 5) {
            double valor = 1.5 * quantidade;
            System.out.printf("=> Total: R$%.2f", valor);
        } else {
            System.out.println("=> Opção Indísponivel.");
        }

        input.close();

    }
}
