public class tiposDeString{
    public static void main(String[] args) {
        
        String texto = "Paulo GOSIK mascarenhas MoiTa";
        System.out.printf("\n=> Texto original: %s\n\n", texto);

        System.out.println("=> Formatar Strings ---------------------------");
        System.out.printf("=> Lower case: %s\n", (texto.toLowerCase()));
        System.out.printf("=> Upper case: %s\n", (texto.toUpperCase()));
        System.out.printf("=> Texto sem espaços nos cantos: %s\n\n", (texto.trim()));

        System.out.println("=> Recortar Strings ---------------------------");
        System.out.printf("=> Substring(3): %s\n", (texto.substring(3)));
        System.out.printf("=> Substring(3, 12): %s\n\n", (texto.substring(3, 12)));

        System.out.println("=> Substituir Strings ---------------------------");
        System.out.printf("=> Replace('a', 'x'): %s\n", (texto.replace('a', 'x')));
        System.out.printf("=> Replace(\"Paulo\", \"Teste\"): %s\n\n", (texto.replace("Paulo", "Teste")));

        System.out.println("=> Split() ---------------------------");
        String[] vect = texto.split(" ");
        System.out.printf("=> Separando por espaços: \n");
        for (String palavra : vect) {
            System.out.println(palavra);
        }

    }
}

// *FORMATAR STRINGS*
//  toLowerCase() - Letras minúsculas
//  toUpperCase() - Letras maiúsculas
//  trim() - Remove espaços dos cantos

// *RECORTAR STRINGS*
//  substring(inicio) - Imprime a string apenas da posição "inicio" para frente
//  substring(inicio, fim) - Imprime a string entre os intervalos "inicio" e "fim"

// *SUBSTITUIR STRINGS*
//  Replace(char, char) - Trocar caracteres
//  Replace(string, string) - Trocar strings

// *BUSCAR POSIÇÃO STRINGS*
//  IndexOf - Acha a primeira posição de uma string 
//  LastIndexOf - Acha a última posição de uma string

//str.split(" ") - Corta a string de acordo com o caracter informado 