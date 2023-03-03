package curs4.homework;

import java.util.Scanner;

public class Ex1SumNumbers {

    /* Scriem un program care intreaba utilizatorul 10 numere sub urmatoarea forma:
    Please enter number 1:
    Please enter number 2:
    ---etc
    Dupa ce utilizatorul a introdus cele zece numere calculam suma lor si o
    printam sub urmatoarea forma : The sum of the numbers is: */

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            System.out.print("Please enter number " + i + ":");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println("The sum of numbers is: " + sum);
    }
}
