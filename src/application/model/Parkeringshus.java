package application.model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Parkeringshus {

    private String adresse;
    private ArrayList<Parkeringsplads> parkeringspladser = new ArrayList<>();

    public Parkeringshus(String adresse) {
        this.adresse = adresse;
    }

    public Parkeringsplads createParkeringsPlads(int nummer, LocalTime ankomst, Parkeringshus parkeringshus) {
        Parkeringsplads parkeringsplads = new Parkeringsplads(nummer, ankomst, this);
        parkeringspladser.add(parkeringsplads);
        return parkeringsplads;
    }

    public void addParkeringsPlads(Parkeringsplads parkeringsplads) {
        if (!parkeringspladser.contains(parkeringsplads)) {
            parkeringspladser.add(parkeringsplads);
            parkeringsplads.setParkeringshus(this);
        }
    }

    public void removeParkeringsPlads(Parkeringsplads parkeringsplads) {
        if(parkeringspladser.contains(parkeringsplads)) {
            parkeringspladser.remove(parkeringsplads);
            parkeringsplads.setParkeringshus(null);
        }
    }

    public int  antalLedigePladser() {
        int antalLedige = 0;
        for (Parkeringsplads parkeringsplads : parkeringspladser) {
            if (parkeringsplads.getBil() == null) {
                antalLedige++;
            }
        }
        return antalLedige;
    }


    public String getAdresse() {
        return adresse;
    }
}
