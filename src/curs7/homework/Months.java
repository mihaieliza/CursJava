package curs7.homework;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        printMonths();
    }

    public static void printMonths() {
        String[] months = {"", "ianuarie ", "februarie ", "martie ", "aprilie ", "mai ",
                "iunie ", "iulie ", "august ", "septembrie ", "octombrie ", "noiembrie ", "decembrie" };

        System.out.print("Introdu un numar: ");
        Scanner scanner = new Scanner(System.in);
        for (int number = scanner.nextInt(); number < months.length; number = scanner.nextInt()) {
            for (int i = 0; i < months.length; i++) {
                if (i == number)
                    System.out.println(months[i]);
            }
            System.out.print("Introdu un numar: ");
        }
    }
}


