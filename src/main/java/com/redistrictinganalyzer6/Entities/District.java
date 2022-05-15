package com.redistrictinganalyzer6.Entities;
import java.util.List;
import javax.persistence.*;

enum STATUS_TYPE{
    ENACTED, OLD, DEM_PROPOSED, REP_PROPOSED
}
@Entity
@Table(name="district")
public class District {

    public District(){}
    @Column(name = "district_id") @Id private Integer districtId;
    @Column(name = "state") private String state;
    @Column(name = "state_id") private Integer stateId;
    @Column(name = "population") private Integer population;
    @Column(name = "area") private double area;
    @Column(name = "compactness") private double compactness;
    @Column(name = "perimeter") private double perimeter;
    @Transient private List<Precinct> precincts;

    public District(Integer districtId, String state, Integer stateId, Integer population, double area, double compactness,
                    double perimeter, List<Precinct>precincts) {
        this.districtId = districtId;
        this.state = state;
        this.stateId = stateId;
        this.population = population;
        this.area = area;
        this.compactness = compactness;
        this.perimeter = perimeter;
        this.precincts = precincts;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCompactness() {
        return compactness;
    }

    public void setCompactness(double compactness) {
        this.compactness = compactness;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public List<Precinct> getPrecincts() {
        return precincts;
    }

    public void setPrecincts(List<Precinct> precincts) {
        this.precincts = precincts;
    }
}

