package com.alaw810.ex1;

public class Main {
    public static void main(String[] args) {
        Worker genericWorker = new Worker("Alex", "Smith", 20);
        RemoteWorker remoteWorker = new RemoteWorker("Jamie", "Brown", 25);
        OnsiteWorker onsiteWorker = new OnsiteWorker("Taylor", "Green", 22);

        int workedHours = 160;

        System.out.println("Generic worker salary: " + genericWorker.calculateSalary(workedHours));
        System.out.println("Remote worker salary: " + remoteWorker.calculateSalary(workedHours));
        System.out.println("Onsite worker salary: " + onsiteWorker.calculateSalary(workedHours));
    }
}
