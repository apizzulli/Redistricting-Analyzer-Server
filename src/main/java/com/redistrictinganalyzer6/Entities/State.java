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

    public State(int id, int population/*, List<DistrictPlan> districtPlans, List<Boundary> countyLines*/) {
        this.id = id;
        this.population = population;
//        this.districtPlans = districtPlans;
//        this.countyLines = countyLines;
    }
//    @ManyToOne public List<DistrictPlan> getDistrictPlans() {
//        return districtPlans;
//    }
//    @ManyToOne public List<Boundary> getCountyLinesLines(){
//        return this.countyLines;
//    }

    public int getId() {return this.id;}
    public void setId(int id) {this.id = id;}
    public int getPopulation() {return this.population;}
    public void setPopulation(int population) {this.population = population;}
}