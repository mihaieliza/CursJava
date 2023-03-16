package curs8;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //tine si valori duplicate
        list.add("Maria");
        list.add("Ion");
        list.add("George");
        for (String elem :list) {
            System.out.println(elem);
        }

        String text = "Marius";
        list.add(text);
        list.add("Ioana");
        list.add("Alex");
        System.out.println("------------------");
        System.out.println(list.subList(2,4).contains("Marius"));
        list.subList(2,4).clear(); // stergem elem cu index 2 si 3 pt ca index de final nu este luat in calc
    }
}
