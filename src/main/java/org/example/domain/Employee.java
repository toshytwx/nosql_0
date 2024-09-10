package org.example.domain;

public class Employee extends Person {
    private final int employeeId;
    private final String jobTitle;

    public Employee(String name, int age, int employeeId, String jobTitle) {
        super(name, age);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    @Override
    public String getRole() {
        return "Cinema Employee";
    }

    public String getRole(boolean detailed) {
        if (detailed) {
            return "Employee ID: " + employeeId + ", Job Title: " + jobTitle;
        }
        return getRole();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId + ", Job Title: " + jobTitle);
    }
}
