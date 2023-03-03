package curs4;

import javax.swing.*;
import java.util.Scanner;

public class LetterSearch {
    /* facem un program care citeste un string de la tastatura
    cautam in string litera a si daca o gasim afisam mesajul
    litera a exista altfel printam litera a nu exista
    printam si numarul de aparitii al literei a
     */
    public static void main(String[] args) {
        searchLetter();
    }

    public static void searchLetter(){
        System.out.println("Please enter your text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next().toLowerCase();
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a'){
                counter++;
                break;  // cu break aici programul se opreste dupa ce a gasit prima aparitie a lui a
            }
        }
        if (counter > 0)
            System.out.println("Litera a apare de " + counter + " ori");
        else
            System.out.println("Litera a nu apare in text");
    }
}
