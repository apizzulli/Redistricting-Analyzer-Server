package com.redistrictinganalyzer6;

public class District {

    private int id;
    private int population;
    private int demSeats;
    private int repSeats;
    private int[] racialData;
    private Precinct[] precincts;

    public District(int id, int population, int demSeats, int repSeats, int[] racialData, Precinct[] precincts) {
        this.id = id;
        this.population = population;
        this.demSeats = demSeats;
        this.repSeats = repSeats;
        this.racialData = racialData;
        this.precincts = precincts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getDemSeats() {
        return demSeats;
    }

    public void setDemSeats(int demSeats) {
        this.demSeats = demSeats;
    }

    public int getRepSeats() {
        return repSeats;
    }

    public void setRepSeats(int repSeats) {
        this.repSeats = repSeats;
    }

    public int[] getRacialData() {
        return racialData;
    }

    public void setRacialData(int[] racialData) {
        this.racialData = racialData;
    }

    public Precinct[] getPrecincts() {
        return precincts;
    }

    public void setPrecincts(Precinct[] precincts) {
        this.precincts = precincts;
    }
}
