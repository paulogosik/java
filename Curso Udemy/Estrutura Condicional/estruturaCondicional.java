import java.util.
public class estruturaCondicional {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int hours;

        System.out.printf("=> Que horas são? (Formato 24Hs, Ex.: 18, 22) ");
        hours = input.nextInt();
        
        if (hours <= 12 && hours >= 6) {
            System.out.println("Bom dia!");
        }
        else if (hours <= 18 && hours > 12) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }

        input.close();

    }
}
