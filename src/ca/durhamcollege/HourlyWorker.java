/* Program Name: OOP 3200 - Java Lab 4 - Employee
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: December 12, 2020
 * Description: Uses abstract classes and polymorphism
 */
package ca.durhamcollege;

import java.time.LocalDate;

public class HourlyWorker extends Employee
{
    //Declarations
    private double hourlyRate;
    private double hoursPerWeek;

    // Getter for Hourly Rate
    public double getHourlyRate()
    {
        return hourlyRate;
    }

    //Setter for Hourly Rate
    public void setHourlyRate(double hourlyRate)
    {
        if(hourlyRate < 17)
        {
            throw new IllegalArgumentException("Hourly Rate cannot be under $17.00.");
        }
        else
        {
            this.hourlyRate = hourlyRate;
        }
    }

    //Getter for Hours Per Week
    public double getHoursPerWeek()
    {
        return hoursPerWeek;
    }
    //Setter for Hours Per Week
    public void setHoursPerWeek(double hoursPerWeek)
    {
        if (hoursPerWeek > 48)
        {
            throw new IllegalArgumentException("Hours per week cannot go over the maximum of 48 hours.");
        }
        else
        {
            this.hoursPerWeek = hoursPerWeek;
        }
    }

    //Parameterized Constructor
    public HourlyWorker(String fullName, LocalDate birthDate, String id, double hourlyRate, double hoursPerWeek)
    {
        super(fullName, birthDate, id);
        setHourlyRate(hourlyRate);
        setHoursPerWeek(hoursPerWeek);
    }

    //Method for calculatePayDay()
    @Override
    public double calculatePayDay()
    {
        double earnedPerWeek = hourlyRate * hoursPerWeek;
        return (double)Math.round(earnedPerWeek / 0.01) * 0.01;
    }
}