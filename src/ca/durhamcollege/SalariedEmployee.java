package ca.durhamcollege;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    protected double annualSalary;

    public SalariedEmployee(String fullName, LocalDate birthDate, String id, double salary){
        super(fullName, birthDate, id);
        annualSalary = salary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePayDay(){
        return Math.round(annualSalary / 52 / 0.01) * 0.01;
    }
}
