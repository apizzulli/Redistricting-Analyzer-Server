package com.redistrictinganalyzer6.Entities;
import javax.persistence.*;
import java.util.List;

@Entity
public class County {
    @Column(name="county_id") @Id private int countyId;
    @Column(name="geometry") private String geometry;
    @Column(name="state") private String state;
    @Transient private List<Precinct> precincts;

    public County(int countyId, String geometry, String state, List<Precinct> precincts) {
        this.countyId = countyId;
        this.geometry = geometry;
        this.state = state;
        this.precincts=precincts;
    }

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    public String getGeometry() {
        return geometry;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
