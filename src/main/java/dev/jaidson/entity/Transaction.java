package dev.jaidson.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;


public class Transaction extends PanacheEntityBase {

    protected double amount;
    protected String description;


//    public Transaction(double amount, String description) {
//        this.amount = amount;
//        this.description = description;
//    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
