package com.alaw810.ex1;

public class RemoteWorker extends Worker {
    private final int INTERNET_FLAT_RATE = 40;

    public RemoteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hours) {
        return hours * getHourlyRate() + INTERNET_FLAT_RATE;
    }
}
