package com.redistrictinganalyzer6;

public class Precinct {

    private int countyID;
    private int population;
    private int[] racialData;
    private int[] electionData;

    public Precinct(int countyID, int population, int[] racialData, int[] electionData) {
        this.countyID = countyID;
        this.population = population;
        this.racialData = racialData;
        this.electionData = electionData;
    }

    public int getCountyID() {
        return countyID;
    }

    public void setCountyID(int countyID) {
        this.countyID = countyID;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int[] getRacialData() {
        return racialData;
    }

    public void setRacialData(int[] racialData) {
        this.racialData = racialData;
    }

    public int[] getElectionData() {
        return electionData;
    }

    public void setElectionData(int[] electionData) {
        this.electionData = electionData;
    }
}
