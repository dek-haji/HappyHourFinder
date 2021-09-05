package com.HappyHour.demo.restaurants;

import java.util.Date;

public class restaurants {
    private int id;
    private String name;
    private String location;
    private String DealType;

    public restaurants(int id, String name, String location, String DealType)
    {
        this.id = id;
        this.name = name;
        this.location = location;
        this.DealType = DealType;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDealType() {
        return DealType;
    }

    public void setDealType(String dealType) {
        DealType = dealType;
    }
}
