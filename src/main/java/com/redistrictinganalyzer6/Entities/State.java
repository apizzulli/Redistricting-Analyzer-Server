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
    @Transient private List<Seawulf> seawulfInstances;

    public State(int id, int population, List<DistrictPlan> districtPlans, List<Seawulf>seawulfInstances) {
        this.id = id;
        this.population = population;
        this.districtPlans = districtPlans;
        this.seawulfInstances = seawulfInstances;
//        this.countyLines = countyLines;
    }


    public int getId() {return this.id;}
    public void setId(int id) {this.id = id;}
    public int getPopulation() {return this.population;}
    public void setPopulation(int population) {this.population = population;}
    public void setDistrictPlans(List<DistrictPlan> plans){this.districtPlans=plans;}
    public List<DistrictPlan> getDistrictPlans(){return districtPlans;}
    public List<Seawulf> getSeawulfInstances(){return seawulfInstances;}
    public void setSeawulfInstances(List<Seawulf>seawulfInstances){this.seawulfInstances = seawulfInstances;}

}