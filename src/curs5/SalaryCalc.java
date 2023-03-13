package curs5;

import java.util.Scanner;

public class SalaryCalc {

    public static void main(String[] args) {
        calculateSalary();
    }

    public static void calculateSalary() {
        System.out.print("Introdu numarul de ore lucrate: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int ratePerHour = 15;


        while (number < 1 || number > 40){
            System.out.println("Introdu un numar intre 1 si 40!");
            number = scanner.nextInt();
        }
        System.out.print("Salariul este: " + number * ratePerHour);
    }
}
