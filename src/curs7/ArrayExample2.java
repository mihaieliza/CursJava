package curs7;

public class ArrayExample2 {

    public static void main(String[] args) {
//        String[] orase = new String[4];
//        orase[0] = "Iasi";

        String[] orase = {"Iasi", "Bacau", "Cluj", "Pitesti"};
        for (String element:orase) {
            System.out.println(element);
        }

        System.out.println(orase[4]);
    }
}
