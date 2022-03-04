package com.redistrictinganalyzer6;

public class ElectionData {
    enum State{
        TN,
        MI
    }
    private int demVotes;
    private int repVotes;
    public ElectionData(int demVotes, int repVotes){
        this.demVotes=demVotes;
        this.repVotes=repVotes;
    }

    public int getDemVotes() {
        return demVotes;
    }
    public int getRepVotes() {
        return repVotes;
    }
    public void setDemVotes(int demVotes) {
        this.demVotes = demVotes;
    }
    public void setRepVotes(int repVotes) {
        this.repVotes = repVotes;
    }


}
