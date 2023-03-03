package curs4;

import java.util.Scanner;

public class CheckVowels {

    public static void main(String[] args) {
        System.out.println("Introdu o litera: ");
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);

        switch (input) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Este vocala!");
                break;
            default:
                System.out.println("Este consoana!");
        }
    }
}
