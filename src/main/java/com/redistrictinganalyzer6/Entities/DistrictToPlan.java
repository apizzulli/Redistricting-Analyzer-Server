package com.redistrictinganalyzer6.Entities;
import javax.persistence.*;

@Entity
@Table(name="district_to_district_plan")
public class DistrictToPlan {

    public DistrictToPlan(){}
    @Column(name="district_id")@Id private int districtId;
    @Column(name="plan_id") private int planId;


    public DistrictToPlan(int planId, int districtId) {
        this.planId = planId;
        this.districtId = districtId;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }


}
