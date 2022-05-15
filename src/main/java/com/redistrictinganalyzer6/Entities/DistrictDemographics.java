package com.redistrictinganalyzer6.Entities;

public class DistrictDemographics {
    public DistrictDemographics(){}
    private int districtId;
    private int whitePop;
    private int blackPop;
    private int nativePop;
    private int asianPop;

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public int getWhitePop() {
        return whitePop;
    }

    public void setWhitePop(int whitePop) {
        this.whitePop = whitePop;
    }

    public int getBlackPop() {
        return blackPop;
    }

    public void setBlackPop(int blackPop) {
        this.blackPop = blackPop;
    }

    public int getNativePop() {
        return nativePop;
    }

    public void setNativePop(int nativePop) {
        this.nativePop = nativePop;
    }

    public int getAsianPop() {
        return asianPop;
    }

    public void setAsianPop(int asianPop) {
        this.asianPop = asianPop;
    }

    public DistrictDemographics(int districtId, int whitePop, int blackPop, int nativePop, int asianPop) {
        this.districtId = districtId;
        this.whitePop = whitePop;
        this.blackPop = blackPop;
        this.nativePop = nativePop;
        this.asianPop = asianPop;
    }
}
