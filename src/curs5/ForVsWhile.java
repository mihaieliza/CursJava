package curs5;

import java.util.Scanner;

public class ForVsWhile {

    public static void main(String[] args) {
//        rezolvareCuFor();
//        System.out.println("------------------");
        rezolvareCuWhile();
    }

    public static void rezolvareCuFor() {
        System.out.print("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int number = scanner.nextInt(); number != 0; number = scanner.nextInt()) {
            sum = sum + number;
            System.out.print("Please enter number:");
        }
        System.out.println("Suma totala: " + sum);
    }

    public static void rezolvareCuWhile() {
        System.out.print("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number;
            System.out.print("Please enter a number: ");
            number = scanner.nextInt();
        }
        System.out.println("Suma totala: " + sum);
    }
}
