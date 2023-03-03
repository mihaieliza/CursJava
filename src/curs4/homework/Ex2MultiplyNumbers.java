package curs4.homework;

import java.util.Scanner;

public class Ex2MultiplyNumbers {

    /* Scriem un program care intreaba utilizatorul un numar si printeaza
       tabla inmultirii acelui numar de la 1 la 10
        Exemplu :
        Please enter a number: 3
        Printam :
        3 * 1 = 3
        3 * 2 = 6
        3 * 3 = 9
        3 * 4 = 12
        3 * 5 = 15
        ----etc */

    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
