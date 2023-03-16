package curs8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //mosteneste data type-ul de la Set, deci va fi String
        //nu am niciun index la set.
        System.out.println(set.isEmpty());
        set.add("rosu");
        set.add("verde");
        set.add("albastru");
        System.out.println("-------------------------");
        System.out.println(set.size());
        System.out.println("-------------------------");
        System.out.println(set.contains("alb"));
        System.out.println("-------------------------");
        //parcurgere set cu iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) { //cat timp in interiorul colectiei exista un element fac ceva / printez
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------");
        set.remove("verde");
        //foreach-ul implementeaza iteratorul - aceeasi logica
        for (String element : set) {
            System.out.println(element);
        }

/*      nu se pun un Map intr-un Set, fiindca are alta structura si nu va putea prelua metodele din Set
        collection (Set, Mapp, List) pot tine elememnte liste a caror dimensiune se modifica si
        nu o stiu de la inceput
        daca vreau o lista in care sa nu tin duplicate folosesc Set, altfel folosesc List
 */
    }
}
