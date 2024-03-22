teste
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String day;

        System.out.printf("=> Informe um número de 1 a 7: ");
        int x = input.nextInt();

        switch(x) {
            case 1:
                day = "Domingo";
                break;
            case 2:
                day = "Segunda-feira";
                break;
            case 3:
                day = "Terça-feira";
                break;
            case 4:
                day = "Quarta-feira";
                break;
            case 5:
                day = "Quinta-feira";
                break;
            case 6:
                day = "Sexta-feira";
                break;
            case 7:
                day = "Sábado";
                break;
            default:
                day = "Valor inválido";       
        }
        
        System.out.printf("=> Dia da semana: %s", day);

        input.close();

    }
}
