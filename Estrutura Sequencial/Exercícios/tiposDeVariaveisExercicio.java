package Exercícios;

import java.util.Locale;

public class tiposDeVariaveisExercicio {
    public static void main(String[] args) {

        String product1 = "Computador";
        String product2 = "Mesa de escritório";
        char gender = 'M';

        int age = 18;
        int code = 457319;
        double price1 = 2100;
        double price2 = 650;
        double measure = 53.234567;

        System.out.println("\n----------------------");
        System.out.println("Products:");
        System.out.printf("%s, no qual o valor é $%.2f.\n", product1, price1);
        System.out.printf("%s, no qual o valor é $%.2f.\n", product2, price2);

        System.out.println("");
        System.out.printf("Registro: %d anos, código %d e gênero: %s\n", age, code, gender);
        System.out.println("");

        System.out.printf("Medida com oito casas decimais: %.8f\n", measure);
        System.out.printf("Arredondado (três casas decimais): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Identação americana: %.3f\n", measure);
        System.out.println("----------------------\n");
        
    }
    
}
