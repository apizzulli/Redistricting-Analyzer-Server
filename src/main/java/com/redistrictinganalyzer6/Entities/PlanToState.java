package com.redistrictinganalyzer6.Entities;
import javax.persistence.*;

@Entity
@Table(name="plan_to_state")
public class PlanToState {
    public PlanToState(){}
    @Column(name="plan_id")@Id private int planId;
    @Column(name = "state")private int stateId;

    public PlanToState(int planId, int stateId){
        this.planId = planId;
        this.stateId = stateId;
    }

    public int getPlanId() {return planId;}
    public void setPlanId(int planId) {this.planId = planId;}
    public int getStateId() {return stateId;}
    public void setStateId(int stateId) {this.stateId = stateId;}
}
