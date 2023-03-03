package curs4.homework;

import java.util.Scanner;

public class Ex4Switch {

    /*  Scriem un program care intreaba utilizatorul un numar.
        Avem un switch care pentru fiecare numar de la 1 la 7 atribuie o
        valoare reprezentand una din zilele saptamanii unei variabile care
        se numeste ziuaSaptamanii.
        Daca utilizatorul introduce orice numar peste 7 va primi mesajul:
        “Te rugam sa introduci un numar intre 1 si 7”
        Daca a fost introdus un numar valid se va printa:
        ”ziua saptamanii este <ziua aferenta nr introdus>” */

    public static void main(String[] args) {
        System.out.print("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String ziuaSaptamanii;

        switch (number) {
            case 1:
                ziuaSaptamanii = "Luni";
                System.out.println("Ziua saptamanii este " + ziuaSaptamanii);
                break;
            case 2:
                ziuaSaptamanii = "Marti";
                System.out.println("Ziua saptamanii este " + ziuaSaptamanii);
                break;
            case 3:
                ziuaSaptamanii = "Miercuri";
                System.out.println("Ziua saptamanii este " + ziuaSaptamanii);
                break;
            case 4:
                ziuaSaptamanii = "Joi";
                System.out.println("Ziua saptamanii este " + ziuaSaptamanii);
                break;
            case 5:
                ziuaSaptamanii = "Vineri";
                System.out.println("Ziua saptamanii este " + ziuaSaptamanii);
                break;
            case 6:
                ziuaSaptamanii = "Sambata";
                System.out.println("Ziua saptamanii este " + ziuaSaptamanii);
                break;
            case 7:
                ziuaSaptamanii = "Duminica";
                System.out.println("Ziua saptamanii este " + ziuaSaptamanii);
                break;
            default:
                if (number > 7)
                    System.out.println("Te rugam sa introduci un numar intre 1 si 7");
        }
    }
}
