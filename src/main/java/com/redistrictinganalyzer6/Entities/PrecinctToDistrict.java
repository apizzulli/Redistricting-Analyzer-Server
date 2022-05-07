package com.redistrictinganalyzer6.Entities;
import javax.persistence.*;

@Entity
public class PrecinctToDistrict {
    public PrecinctToDistrict(){}
    @Id @Column(name="id") private int id;
    @Column(name="precinct_id") private int precinctId;
    @Column(name="district_id") private int districtId;

    public PrecinctToDistrict(int id, int precinctId, int districtId) {
        this.id = id;
        this.precinctId = precinctId;
        this.districtId = districtId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecinctId() {
        return precinctId;
    }

    public void setPrecinctId(int precinctId) {
        this.precinctId = precinctId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }
}

