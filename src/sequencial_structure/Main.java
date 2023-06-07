package sequencial_structure;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        double y = 200.23;
        String name = "Joao";
//        Inserindo %.2f indica que voce quer somente 2 casas decimais | Ja o %n e a quebra de linha
        System.out.printf("%s tem %d de idade e ja tem %.2f R$ no banco", name, x, y);

    }
}
