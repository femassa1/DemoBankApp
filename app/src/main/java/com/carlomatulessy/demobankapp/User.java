package com.carlomatulessy.demobankapp;

/**
 * Created by CarloMatulessy on 31/07/16.
 */
public class User {

    private String name;
    private String iban;
    private double amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
