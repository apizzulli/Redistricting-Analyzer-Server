package com.redistrictinganalyzer6.Entities;
import java.util.List;
import javax.persistence.ManyToOne;
import javax.persistence.Column;

enum STATUS_TYPE{
    ENACTED, OLD, DEM_PROPOSED, REP_PROPOSED
}
public class District {

    @Column private int id;
    @Column private int numDistricts;
    @Column private int seatShare;
    @Column private int numMajMinDistricts;
    @Column private STATUS_TYPE status;
    @Column private double efficiencyGap;
    @Column @ManyToOne private List<Precinct> precincts;

    public District(int id, int numDistricts, int seatShare, int numMajMinDistricts, double efficiencyGap, List<Precinct> precincts) {
        this.id = id;
        this.numDistricts = numDistricts;
        this.seatShare = seatShare;
        this.numMajMinDistricts = numMajMinDistricts;
        this.efficiencyGap = efficiencyGap;
        this.precincts = precincts;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumDistricts() {return numDistricts;}
    public void setNumDistricts(int numDistricts) {this.numDistricts = numDistricts;}
    public int getSeatShare() {return seatShare;}
    public void setSeatShare(int seatShare) {this.seatShare = seatShare;}
    public int getNumMajMinDistricts() {return numMajMinDistricts;}
    public void setNumMajMinDistricts(int numMajMinDistricts) {this.numMajMinDistricts = numMajMinDistricts;}
    public STATUS_TYPE getStatus() {return status;}
    public void setStatus(STATUS_TYPE status) {this.status = status;}
    public double getEfficiencyGap() {return efficiencyGap;}
    public void setEfficiencyGap(double efficiencyGap) {this.efficiencyGap = efficiencyGap;}
    public List<Precinct> getPrecincts() {
        return precincts;
    }
    public void setPrecincts(List<Precinct> precincts) {
        this.precincts = precincts;
    }
}
