package While_structure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x != 0) {
            System.out.print("Informe um numero: ");
            x = sc.nextInt();
        }
        System.out.println("X agora e zero, tchau");
    }
}
