package com.example.restservice;

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
}
