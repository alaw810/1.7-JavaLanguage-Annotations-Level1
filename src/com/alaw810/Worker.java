package com.alaw810;

public class Worker {
    private String name;
    private String surname;
    private double hourlyRate;

    public Worker(String name, String surname, double hourlyRate) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hours) {
        return hours * hourlyRate;
    }
}
