package com.redistrictinganalyzer6.Entities;
import javax.persistence.*;

@Entity
public class PrecinctToCounty {
    @Column(name="precinct_id")@Id private int precinctId;
    @Column(name="county_id") private int countyId;

    public PrecinctToCounty(int precinctId, int countyId) {
        this.precinctId = precinctId;
        this.countyId = countyId;
    }

    public int getPrecinctId() {
        return precinctId;
    }

    public void setPrecinctId(int precinctId) {
        this.precinctId = precinctId;
    }

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }
}
