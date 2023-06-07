package ConditionalStructure;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.print("Insert a number of 0 a 100: ");
        x = sc.nextDouble();
        if(x > 0.0 || x < 25.00) {
            System.out.println("You number is in this interval - 0.0 - 25.00");
        } else if (x > 25.01 || x < 50.00) {
            System.out.println("You number is in this interval - 25.01 - 50.00");
        } else if (x > 50.01 || x < 75.00) {
            System.out.println("You number is in this interval 50.01 - 75.00");
         } else if(x > 75.01 || x < 100.00) {
            System.out.println("You number is in this interval - 75.01 - 100.00");
        } else {
            System.out.println("This number is not avaiable");
        }

    }
}
