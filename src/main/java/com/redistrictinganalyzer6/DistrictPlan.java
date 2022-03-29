package com.redistrictinganalyzer6;

public class DistrictPlan {
    enum planStatus {ENACTED, DEMOCRATIC, REPUBLICAN};
    private int numDistricts;
    private Boundary [] splitCounties;
    private District [] districts;
    private planStatus status;

    public DistrictPlan(int numDistricts, Boundary[] splitCounties, District[] districts, planStatus status) {
        this.numDistricts = numDistricts;
        this.splitCounties = splitCounties;
        this.districts = districts;
        this.status = status;
    }

    public int getNumDistricts() {
        return numDistricts;
    }

    public void setNumDistricts(int numDistricts) {
        this.numDistricts = numDistricts;
    }

    public Boundary[] getSplitCounties() {
        return splitCounties;
    }

    public void setSplitCounties(Boundary[] splitCounties) {
        this.splitCounties = splitCounties;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public planStatus getStatus() {
        return status;
    }

    public void setStatus(planStatus status) {
        this.status = status;
    }
}
