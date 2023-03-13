package curs5;

public class StaticVsNonStatic {
    static String nume;
    static String departament = "QA";

    public static void main(String[] args) {

        StaticVsNonStatic person = new StaticVsNonStatic();
        person.nume = "Oana";
        System.out.println(person.nume + " " +  departament);
        System.out.println("------------------------");

        StaticVsNonStatic person2 = new StaticVsNonStatic();
        person2.nume = "Maria";
        System.out.println(person2.nume + " " + departament);
        System.out.println("------------------------");

        departament = "DEV";
        StaticVsNonStatic person3 = new StaticVsNonStatic();
        person3.nume = "Ion";
        System.out.println(person3.nume + " " + departament);

      /* afiseaza Ion de 3 ori - cand adaugam o persoana suprascriem variabilele (declarate static)
        nume si departament primesc valoare si sunt incarcate in memorie inainte de a crea obiectul,
        deci se aloca o singura locatie de memorie si valoare ei se suprascrie de fiecare data cand
        voi face un obiect nou */
        System.out.println("------------------------");
        System.out.println(person.nume + " " +  departament);
        System.out.println(person2.nume + " " +  departament);
        System.out.println(person3.nume + " " +  departament);


    }
}
