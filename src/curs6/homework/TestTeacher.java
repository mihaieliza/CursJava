package curs6.homework;

public class TestTeacher {
    public static void main(String[] args) {
        Qualification teacher1 = new Qualification("Java", 5, "Afternoon");
        Qualification teacher2 = new Qualification("C++", 3, "Morning");
        Teacher teacher3 = new Teacher("Java", 4, "Afternoon");

        teacher1.verify();
        System.out.println("----------------------------");
        teacher2.verify();
        System.out.println("----------------------------");
    }
}
