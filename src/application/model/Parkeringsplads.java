package application.model;

import java.time.LocalTime;

public class Parkeringsplads {

    private int nummer;
    private LocalTime ankomst;
    private Bil bil;
    private Parkeringshus parkeringshus;

    public Parkeringsplads(int nummer, LocalTime ankomst, Parkeringshus parkeringshus) {
        this.nummer = nummer;
        this.ankomst = ankomst;
        this.setParkeringshus(parkeringshus);
    }

    public Parkeringshus getParkeringshus() {
        return parkeringshus;
    }

    public void setParkeringshus(Parkeringshus parkeringshus) {
        if (this.parkeringshus != parkeringshus) {
            Parkeringshus oldparkeringhus = this.parkeringshus;
            if (oldparkeringhus != null) {
                oldparkeringhus.removeParkeringsPlads(this);
            }
            this.parkeringshus = parkeringshus;
            if (parkeringshus != null) {
                parkeringshus.addParkeringsPlads(this);
            }
        }
    }

    public Bil getBil() {
        return bil;
    }

    public void setBil(Bil bil) {
        if (this.bil != bil) {
            this.bil = bil;
        }
    }

    public int getNummer() {
        return nummer;
    }

    public LocalTime getAnkomst() {
        return ankomst;
    }
}
