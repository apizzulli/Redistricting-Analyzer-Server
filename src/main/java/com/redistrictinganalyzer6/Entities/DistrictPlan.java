package com.redistrictinganalyzer6.Entities;
import javax.persistence.*;
import java.util.List;


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
    @Column(name="polsby_popper")private double polsbyPopper;
    @Column(name="bias") private double bias;
    @Column(name="symmetry") private double symmetry;
    @Column(name="responsiveness") private double responsiveness;
    @Transient private List<District> districts;
    @Transient private List<Coordinates> demCoords;
    @Transient private List<Coordinates> repCoords;

    public double getBias() {
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }

    public double getSymmetry() {
        return symmetry;
    }

    public void setSymmetry(double symmetry) {
        this.symmetry = symmetry;
    }

    public double getResponsiveness() {
        return responsiveness;
    }

    public void setResponsiveness(double responsiveness) {
        this.responsiveness = responsiveness;
    }

    public DistrictPlan(int planId, Integer numDistricts, Integer seatShare, Integer numMajMinDistricts, String status,
                        double efficiencyGap, List<District> districts, double polsbyPopper, double bias, double symmetry,
                        double responsiveness, List<Coordinates> demCoords, List<Coordinates> repCoords){
        this.planId = planId;
        this.numDistricts = numDistricts;
        this.seatShare = seatShare;
        this.numMajMinDistricts = numMajMinDistricts;
        this.status = status;
        this.efficiencyGap = efficiencyGap;
        this.districts = districts;
        this.demCoords = demCoords;
        this.repCoords = repCoords;
        this.polsbyPopper = polsbyPopper;
        this.bias = bias;
        this.symmetry = symmetry;
        this.responsiveness = responsiveness;
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

    public double getPolsbyPopper() {
        return polsbyPopper;
    }

    public void setPolsbyPopper(double polsbyPopper) {
        this.polsbyPopper = polsbyPopper;
    }

    public List<District> getDistricts(){return this.districts;}
    public void setDistricts(List<District> districts){this.districts = districts;}
    public List<Coordinates> getDemCoords() {return demCoords;}
    public void setDemCoords(List<Coordinates>demCoords){this.demCoords=demCoords;}
    public List<Coordinates> getRepCoords(){return this.repCoords;}
    public void setRepCoords(List<Coordinates>repCoords){this.repCoords=repCoords;}
}
