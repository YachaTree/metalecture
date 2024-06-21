package com.i5.common;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Bread extends Product{
    private Date bakedDate;

    public Bread() {}

    public Bread(String name, int price, Date bakedDate) {
        super(name, price);
        this.bakedDate = bakedDate;
    }

    public Date getBakedDate() {
        return bakedDate;
    }

    public void setBakedDate(Date bakedDate) {
        this.bakedDate = bakedDate;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.bakedDate;
    }
}
