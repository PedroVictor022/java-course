package sequencial_structure.EXERCICES;

import java.util.Scanner;

public class Exercice {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.println("Insert two int numbers");
        System.out.print("First number: ");
        x = sc.nextInt();
        System.out.print("Second number: ");
        y = sc.nextInt();
        z = x + y;
        System.out.printf("%d + %d = %d", x, y, z);

    }
}
