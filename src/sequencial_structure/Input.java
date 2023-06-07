package sequencial_structure;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        char v;
        x = sc.nextLine(); // STRING
        y = sc.nextInt(); // INT
        z = sc.nextDouble(); // Double
        v = sc.next().charAt(0); // Get a first char a string

        System.out.println("Insert a String: " + x);
        System.out.println("Insert a int number: " + y);
        System.out.println("Insert a number with float point: " + z);
        System.out.println("Insert a char: " + v);
        sc.close();
    }
}
