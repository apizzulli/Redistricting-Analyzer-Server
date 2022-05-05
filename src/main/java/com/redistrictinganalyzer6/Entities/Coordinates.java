package com.redistrictinganalyzer6.Entities;

import javax.persistence.Column;

public class Coordinates {

    @Column private double x;
    @Column private double y;

    public Coordinates(double x, double y){
        this.x=x;
        this.y=y;
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
}
