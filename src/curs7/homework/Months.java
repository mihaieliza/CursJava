package curs7.homework;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        printMonths();
    }

    public static void printMonths() {
        int number;
        String[] months = {"ianuarie ", "februarie ", "martie ", "aprilie ", "mai ",
                "iunie ", "iulie ", "august ", "septembrie ", "octombrie ", "noiembrie ", "decembrie" };

        System.out.print("Introdu un numar: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        while (number <= 0 || number > 12) {
            System.out.print("Introdu un numar intre 1 si 12. ");
            System.out.print("Introdu un nou numar: ");
            number = scanner.nextInt();
        }
        System.out.println(months[number-1] + " ");
    }
}