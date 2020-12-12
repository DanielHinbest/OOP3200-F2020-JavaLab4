/* Program Name: OOP 3200 - Java Lab 4 - Employee
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: December 12, 2020
 * Description: Uses abstract classes and polymorphism
 */
package ca.durhamcollege;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // Salary variable
    protected double annualSalary;

    // Parameterized constructor
    public SalariedEmployee(String fullName, LocalDate birthDate, String id, double salary){
        super(fullName, birthDate, id);
        annualSalary = salary;
    }

    // Accessor for annual salary
    public double getAnnualSalary() {
        return annualSalary;
    }

    // Mutator for annual salary
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    // Method for calculatePayDay()
    @Override
    public double calculatePayDay(){
        return Math.round(annualSalary / 52 / 0.01) * 0.01;
    }
}
