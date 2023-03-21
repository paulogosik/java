import java.util.Scanner;
public class pesquisaSobreCombustiveis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opc;
        int somaA = 0;
        int somaG = 0;
        int somaD = 0;

        System.out.println("----------------------------");
        System.out.println("=> Escolha uma das opções:");
        System.out.println("    [1] Álcool");
        System.out.println("    [2] Gasolina");
        System.out.println("    [3] Diesel");
        System.out.println("    [4] Fim");
        System.out.printf("=> ");
        opc = input.nextInt();

        while (opc != 4) {
            if (opc == 1) {
                somaA += 1;
            }
            else if (opc == 2) {
                somaG += 1;
            }
            else if(opc == 3) {
                somaD += 1;
            }

            System.out.println("----------------------------");
            System.out.println("=> Escolha uma das opções:");
            System.out.println("    [1] Álcool");
            System.out.println("    [2] Gasolina");
            System.out.println("    [3] Diesel");
            System.out.println("    [4] Fim");
            System.out.printf("=> ");
            opc = input.nextInt();
        }

        System.out.println("----------------------------");
        System.out.println("=> MUITO OBRIGADO");
        System.out.printf("=> Álcool: %d\n", somaA);
        System.out.printf("=> Gasolina: %d\n", somaG);
        System.out.printf("=> Diesel: %d\n", somaD);

        input.close();

    }
}
