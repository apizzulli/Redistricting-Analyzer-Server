package com.redistrictinganalyzer6.Entities;
import javax.persistence.*;
@Entity
public class Seawulf {
    public Seawulf(){}
    @Column(name="id") @Id private int id;
    @Column(name="state") private String state;
    @Column(name="group") private String group;
    @Column(name="district_id")private int districtId;
    @Column(name="min")private double min;
    @Column(name="first")private double first;
    @Column(name="median") private double median;
    @Column(name="third") private double third;
    @Column(name="max") private double max;

    public Seawulf(int id, String state, String group, int districtId, double min, double first, double median, double third, double max) {
        this.id = id;
        this.state = state;
        this.group = group;
        this.districtId = districtId;
        this.min = min;
        this.first = first;
        this.median = median;
        this.third = third;
        this.max = max;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getMedian() {
        return median;
    }

    public void setMedian(double median) {
        this.median = median;
    }

    public double getThird() {
        return third;
    }

    public void setThird(double third) {
        this.third = third;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }
}
