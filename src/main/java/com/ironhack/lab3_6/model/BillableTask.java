package com.ironhack.lab3_6.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class BillableTask extends Tasks{
    private Double hourlyRate;

    public BillableTask() {
    }

    public BillableTask(Double hourlyRate) {
        setHourlyRate(hourlyRate);
    }

    public BillableTask(String title, Date dueDate, Boolean status, Double hourlyRate) {
        super(title, dueDate, status);
        setHourlyRate(hourlyRate);
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
