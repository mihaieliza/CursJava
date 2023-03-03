package curs4.homework;

import java.util.Scanner;

public class SecondToHours {

    /* Scrieti un program care primeste la intrare un numar de secunde
     * si intoarce numarul maxim de ore, minute, secunde echivalent ca timp
     * cu numarul initial de secunde.
     * Exemplu: 7384 secunde este echivalent cu 2 ore, 3 minute si 4 secunde */

    public static void main(String[] args) {
        System.out.print("Please enter the number of seconds:");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hour = 0;
        int minutes = 0;

        hour = (int) (seconds / 3600);
        int newSeconds = hour * 3600;
        int remainingSeconds = seconds - newSeconds;
        minutes = remainingSeconds / 60;
        int updateSeconds = minutes * 60;
        int lastSeconds = remainingSeconds - updateSeconds;

        System.out.println(seconds + " = " + hour + " ore " + minutes + " minute " + lastSeconds+ " secunde");

    }

}
