package curs8;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("T","Tester");
        map.put("D", "Developer");
        map.put("M", "Manager");
        map.put("PO", "Product Owner");

        System.out.println("------Keys------");

        for (String key:map.keySet()) {
            System.out.println(key);
        }
        System.out.println("------Values------");
        for (String value:map.values()) {
            System.out.println(value);
        }
        System.out.println("------Map Content------");
        System.out.println(map); //afiseaza doar un string si nu va putea fi accesat
        System.out.println("------Value for specific key-------"); //key este unica in map
        System.out.println(map.get("T"));
    }
}
