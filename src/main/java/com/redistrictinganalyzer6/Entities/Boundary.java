package com.redistrictinganalyzer6.Entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Boundary {

    private int ID;
    private final String geoJSON;

    public Boundary(String geoJSON){
        this.geoJSON=geoJSON;
    }
    public String getJSON(){
        return this.geoJSON;
    }
    public int getID(){
        return this.ID;
    }
}
