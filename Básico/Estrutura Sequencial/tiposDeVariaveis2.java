import java.util.Locale;
public class tiposDeVariaveis2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String name = "Paulo";
        String lastName = "Moita";
        int age = 18;
        double salary = 1650;

        System.out.println("\n----------------------");
        System.out.printf("%s %s tem %d anos e ganha R$%.2f por mês!\n", name, lastName, age, salary);
        System.out.println("----------------------\n");

    }
}
