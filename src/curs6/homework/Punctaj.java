package curs6.homework;

import java.util.Scanner;

public class Punctaj {
    public static void main(String[] args) {
        punctaj();
    }

    public static void punctaj() {
        System.out.print("Introdu un punctaj: ");
        Scanner scanner = new Scanner(System.in);
        int punctaj = scanner.nextInt();
        String calificativ = (punctaj >= 90) ? "FB" : (punctaj >= 80) ? "B" : "S";
        switch (calificativ) {
            case "FB":
                System.out.println("Ai primit: Foarte Bine");
                break;
            case "B":
                System.out.println("Ai primit: Bine");
                break;
            case "S":
                System.out.println("Ai primit: Suficient");
                break;
            default:
                System.out.println("Nu e valoarea asteptata!");
                break;
        }
    }
}
