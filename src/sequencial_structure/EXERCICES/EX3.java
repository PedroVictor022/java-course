package sequencial_structure.EXERCICES;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, result;

        System.out.print("Insert a A value: ");
        a = sc.nextInt();
        System.out.print("Insert a B value: ");
        b = sc.nextInt();
        System.out.print("Insert a C value: ");
        c = sc.nextInt();
        System.out.print("Insert a D value: ");
        d = sc.nextInt();
        result = (a * b - c * d);
        System.out.println(result);
    }
}
