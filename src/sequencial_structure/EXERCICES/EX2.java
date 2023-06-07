package sequencial_structure.EXERCICES;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, pi = 3.14;
        System.out.print("Insert a raio value: ");
        double raio = sc.nextDouble();
        area = pi * (raio * raio);
        System.out.println("A raio area this is a " + area);
    }
}
