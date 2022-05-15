package com.redistrictinganalyzer6.Entities;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="precinct")
public class Precinct {
    public Precinct(){}
    @Column(name="precinct_id") @Id private int precinctId;
    @Column(name="population") private int population;
    @Column(name="votesDemocrat") private int votesDemocrat;
    @Column(name="votesRepublican") private int votesRepublican;
    @Column(name="state") private int state;
    @Column(name="white") private int whitePop;
    @Column(name="black") private int blackPop;
    @Column(name="native") private int nativePop;
    @Column(name="asian") private int asianPop;

    public Precinct(int precinctId, int population, int votesDemocrat, int votesRepublican,
                    int state, int whitePop, int blackPop, int nativePop, int asianPop) {
        this.precinctId = precinctId;
        this.population = population;
        this.votesDemocrat = votesDemocrat;
        this.votesRepublican = votesRepublican;
        this.state = state;
        this.whitePop = whitePop;
        this.blackPop = blackPop;
        this.nativePop = nativePop;
        this.asianPop = asianPop;
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

    public int getwhitePop() {
        return whitePop;
    }

    public void setwhitePop(int whitePop) {
        this.whitePop = whitePop;
    }

    public int getblackPop() {
        return blackPop;
    }

    public void setblackPop(int blackPop) {
        this.blackPop = blackPop;
    }

    public int getnativePop() {
        return nativePop;
    }

    public void setnativePop(int nativePop) {
        this.nativePop = nativePop;
    }

    public int getasianPop() {
        return asianPop;
    }

    public void setasianPop(int asianPop) {
        this.asianPop = asianPop;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


}
