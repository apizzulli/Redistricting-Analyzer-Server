package com.redistrictinganalyzer6.Entities;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Entity;

enum PLAN_TYPE{ENACTED, PROPOSED, OLD, DEM, REP}

@Entity
@Table(name="state")
public class State {
    public State(){}
    @Column(name = "state") @Id private int id;
    @Column(name = "population") private int population;
    @Transient private List<DistrictPlan> districtPlans;

    public State(int id, int population, List<DistrictPlan> districtPlans) {
        this.id = id;
        this.population = population;
        this.districtPlans = districtPlans;
//        this.countyLines = countyLines;
    }


    public int getId() {return this.id;}
    public void setId(int id) {this.id = id;}
    public int getPopulation() {return this.population;}
    public void setPopulation(int population) {this.population = population;}
    public void setDistrictPlans(List<DistrictPlan> plans){this.districtPlans=plans;}
    public List<DistrictPlan> getDistrictPlans(){return this.districtPlans;}
}