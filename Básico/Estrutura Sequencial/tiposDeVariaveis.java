import java.util.Locale;
public class tiposDeVariaveis {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String name = "Paulo";
        String lastName = "Moita";
        int age = 18;
        double num = 12.457319;

        System.out.println("\n---------------------------");
        System.out.printf("Seu nome é: %s %s\n", name, lastName);
        System.out.printf("Sua idade é %d anos.\n", age);
        System.out.printf("Número com duas casas decimais: %.2f\n", num);
        System.out.printf("Número com quatro casas decimais: %.4f\n", num);
        System.out.printf("Número sem casas decimais: %.0f\n", num);
        System.out.println("---------------------------\n");

    }
}

/*
 * %d - integers numbers
 * %f - float numbers
 * %2f - double numbers
 * %b - boolean values
 * %c - char values
 * %s - String values
 */