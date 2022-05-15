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
   // @Column(name="")
}
