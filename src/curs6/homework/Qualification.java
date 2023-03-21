package curs6.homework;

public class Qualification extends Teacher {

    public Qualification(String course, int experienceYears, String schedule) {
        super(course, experienceYears, schedule);
    }

    public void verify() {
        if (getExperienceYears() > 3 && getCourse().equals("Java")
                && getSchedule().equals("Afternoon")) {
            System.out.println("You qualify to teach at this school!");
        } else
            System.out.println("You do not qualify to teach at this school!");
    }
}
