package com.alaw810.ex1;

public class OnsiteWorker extends Worker {
    private static int gasoline = 100;

    public OnsiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hours) {
        return hours * getHourlyRate() + gasoline;
    }
}
