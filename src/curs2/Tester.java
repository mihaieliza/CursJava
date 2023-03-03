package curs2;

public class Tester {
    //variabile de instanta
    String name;
    int ratePerHour;

    public Tester(){}

    public Tester(String name, int ratePerHour) {
        this.name = name;
        this.ratePerHour = ratePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        /* face referire la variabila de instanta
        atatvar de instanta cat si var locala au acelasi nume: name
        ca sa le diferentiez ma refer la var de instanta cu this.name
        si la var locala cu name */
        this.name = name;
    }

    public int getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(int ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
}
