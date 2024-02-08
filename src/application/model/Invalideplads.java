package application.model;

import java.time.LocalTime;

public class Invalideplads extends Parkeringsplads {

    private double areal;

    public Invalideplads(int nummer, LocalTime ankomst, Parkeringshus parkeringshus, double areal) {
        super(nummer, ankomst, parkeringshus);
        this.areal = areal;
    }


    public double getAreal() {
        return areal;
    }
}
