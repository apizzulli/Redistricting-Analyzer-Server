package com.redistrictinganalyzer6.Entities;
import javax.persistence.*;
@Entity
public class PlotPoints {
    public PlotPoints(){}
    public PlotPoints(int id, int planId, double x, double y, String party) {
        this.id = id;
        this.planId = planId;
        this.x = x;
        this.y = y;
        this.party = party;
    }

    @Column(name="id") @Id private int id;
    @Column(name="plan_id") private int planId;
    @Column(name="x") private double x;
    @Column(name="y") private double y;
    @Column(name="party") private String party;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }
}
