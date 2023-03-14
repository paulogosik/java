public class expressoesLogicas {
    public static void main(String[] args) {

        int x = 5;

        if (x <= 20 && x == 10){
            System.out.println("=> Primeira afirmação verdadeira!");
        } else if (x > 0 && x != 3) {
            System.out.println("=> Segunda afirmação verdadeira!");
        } else if (x <= 20 && x == 12 && x != 3) {
            System.out.println("Terceira afirmação verdadeira!");
        } else {
            System.out.println("Nenhuma das afirmações verdadeiras!");
        }
    }
}

/*
 * (&&) - E
 * (||) - Ou
 * (!) - Não
 */