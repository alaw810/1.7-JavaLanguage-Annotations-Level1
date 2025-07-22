package com.alaw810;

@SuppressWarnings("deprecation")
public class LegacyUsage {
    public static void main(String[] args) {
        RemoteWorker remote = new RemoteWorker("Alice", "Smith", 25);
        OnsiteWorker onsite = new OnsiteWorker("Bob", "Johnson", 30);

        System.out.println("Remote worker old salary method: " + remote.oldSalaryCalculation(40));
        System.out.println("Onsite worker old salary method: " + onsite.oldSalaryCalculation(40));
    }
}
