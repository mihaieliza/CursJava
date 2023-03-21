package curs6;

public class DoWhileExample {
    public static void main(String[] args) {
        String text = "Java";

        int i = 0;
        while (i > text.length()) {
            System.out.println(text.charAt(i));
            i++;
        }

        System.out.println("---------------------------");

        int j = 0;
        do {
            System.out.println(text.charAt(j));
            j++;
        } while (j > text.length());
    }
}
