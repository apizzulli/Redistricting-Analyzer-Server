package com.redistrictinganalyzer6.Entities;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name="plan")
public class DistrictPlan {
    public DistrictPlan(){}
    @Column(name="plan_id")@Id private int planId;
    @Column(name="num_districts") private Integer numDistricts;
    @Column(name="seat_share") private Integer seatShare;
    @Column(name="num_maj_min_districts") private Integer numMajMinDistricts;
    @Column(name="status") private String status;
    @Column(name="efficiency_gap") private double efficiencyGap;

    public DistrictPlan(int planId, Integer numDistricts, Integer seatShare, Integer numMajMinDistricts, String status, double efficiencyGap ){
        this.planId = planId;
        this.numDistricts = numDistricts;
        this.seatShare = seatShare;
        this.numMajMinDistricts = numMajMinDistricts;
        this.status = status;
        this.efficiencyGap = efficiencyGap;
    }

    public int getPlanId() {return planId;}
    public void setPlanId(int planId){this.planId = planId;}
    public Integer getNumDistricts(){return this.numDistricts;}
    public void setNumDistricts(Integer numDistricts){}
    public Integer getSeatShare() {return seatShare;}
    public void setSeatShare(Integer seatShare) {this.seatShare = seatShare;}
    public Integer getNumMajMinDistricts() {return numMajMinDistricts;}
    public void setNumMajMinDistricts(Integer numMajMinDistricts) {this.numMajMinDistricts = numMajMinDistricts;}
    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    public double getEfficiencyGap() {return efficiencyGap;}
    public void setEfficiencyGap(double efficiencyGap) {this.efficiencyGap = efficiencyGap;}
}
