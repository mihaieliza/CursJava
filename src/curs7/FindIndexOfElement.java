package curs7;

public class FindIndexOfElement {
    /* avem un array de tip integer si printam care este indexul
     unui element
     Exemplu: index pentru elementul 6 este 2
     rezolvare cu FOR
     rezolvare cu FOREACH
     */

    static int[] number = {3, 4, 5, 6, 8, 9};

//  daca am nevoie de index atunci am nevoie de for clasic
    public static void rezolvareCuFor() {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == 6) {
                System.out.println("Indexul pt elementul 6 este: " + i);
            }
        }
    }

    public static void rezolvareCuForEach() {
        int counter = 0;
        for (int element : number) {
            if(element == 6){
                System.out.println("Indexul pt elem 6 este: " + counter );
            }
            counter++;
        }
    }


    public static void main(String[] args) {
        rezolvareCuFor();
        System.out.println("---------------------------------");
        rezolvareCuForEach();
    }
}
