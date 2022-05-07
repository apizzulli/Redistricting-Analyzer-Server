package com.redistrictinganalyzer6.Entities;
import javax.persistence.*;

@Entity
@Table(name="precinct")
public class Precinct {
    public Precinct(){}
    @Column(name="precinct_id") @Id private int precinctId;
    @Column(name="population") private int population;
    @Column(name="votesDemocrat") private int votesDemocrat;
    @Column(name="votesRepublican") private int votesRepublican;
    @Column(name="state") private int state;
    @Column(name="white") private int whiteVotes;
    @Column(name="black") private int blackVotes;
    @Column(name="native") private int nativeVotes;
    @Column(name="asian") private int asianVotes;

    public Precinct(int precinctId, int population, int votesDemocrat, int votesRepublican,
                    int state, int whiteVotes, int blackVotes, int nativeVotes, int asianVotes) {
        this.precinctId = precinctId;
        this.population = population;
        this.votesDemocrat = votesDemocrat;
        this.votesRepublican = votesRepublican;
        this.state = state;
        this.whiteVotes = whiteVotes;
        this.blackVotes = blackVotes;
        this.nativeVotes = nativeVotes;
        this.asianVotes = asianVotes;
    }

    public int getPrecinctId() {
        return precinctId;
    }

    public void setPrecinctId(int precinctId) {
        this.precinctId = precinctId;
    }

    public int getVotesDemocrat() {
        return votesDemocrat;
    }

    public void setVotesDemocrat(int votesDemocrat) {
        this.votesDemocrat = votesDemocrat;
    }

    public int getVotesRepublican() {
        return votesRepublican;
    }

    public void setVotesRepublican(int votesRepublican) {
        this.votesRepublican = votesRepublican;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getWhiteVotes() {
        return whiteVotes;
    }

    public void setWhiteVotes(int whiteVotes) {
        this.whiteVotes = whiteVotes;
    }

    public int getBlackVotes() {
        return blackVotes;
    }

    public void setBlackVotes(int blackVotes) {
        this.blackVotes = blackVotes;
    }

    public int getNativeVotes() {
        return nativeVotes;
    }

    public void setNativeVotes(int nativeVotes) {
        this.nativeVotes = nativeVotes;
    }

    public int getAsianVotes() {
        return asianVotes;
    }

    public void setAsianVotes(int asianVotes) {
        this.asianVotes = asianVotes;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


}
