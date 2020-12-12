/* Program Name: OOP 3200 - Java Lab 4 - Employee
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: December 12, 2020
 * Description: Uses abstract classes and polymorphism
 */
package ca.durhamcollege;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args)
    {
        // Declaration for SalariedEmployee Object
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel Hinbest",
                LocalDate.of(2001, Month.AUGUST, 14), "12345678", 60000);

        // Declaration for HourlyWorker Object
        HourlyWorker hourlyWorker = new HourlyWorker("Ryan Clayson",
                LocalDate.of(1996, Month.NOVEMBER, 16), "87654321", 17.00, 48);

        //Print's Yearly Salary
        System.out.println("Daniel's Salary\n---------------");
        System.out.println(salariedEmployee.getName() + ": $" + salariedEmployee.getAnnualSalary());
        salariedEmployee.setAnnualSalary(60001);
        //Print's Updated Salary
        System.out.println("\nDaniel's Updated Salary\n-------------------------");
        System.out.println(salariedEmployee.getName() + "'s new salary: $" + salariedEmployee.getAnnualSalary());

        //Print's Hourly Rate and Number of Hours
        System.out.println("\nRyan's Hourly Rate and Number of Hours\n---------------------------------------------");
        System.out.println(hourlyWorker.getName() + ": $" + hourlyWorker.getHourlyRate() + " per hour, "
                + hourlyWorker.getHoursPerWeek() + " hours per week");

        //Print's Updated Hourly Rate and Number of Hours
        System.out.println("\nRyan's Updated Hourly Rate and Number of Hours\n----------------------------------------------");
        hourlyWorker.setHourlyRate(25.00);
        hourlyWorker.setHoursPerWeek(40);
        System.out.println(hourlyWorker.getName() + ": $" + hourlyWorker.getHourlyRate() + " per hour, "
                + hourlyWorker.getHoursPerWeek() + " hours per week");

        //Start of Try Catch
        try {
            //Declaration of Arrays
            SalariedEmployee[] salariedEmployees = new SalariedEmployee[2];
            HourlyWorker[] hourlyWorkers = new HourlyWorker[3];

            //Created 2 SalariedEmployee Objects
            salariedEmployees[0] = new SalariedEmployee("Jane Doe", LocalDate.of(1990, Month.AUGUST, 21),
            "62784363", 40000);
            salariedEmployees[1] = new SalariedEmployee("John Doe", LocalDate.of(1989, Month.JULY, 12),
                    "63729482", 50000);

            //Created 4 HourlyWorker Objects
            hourlyWorkers[0] = new HourlyWorker("Adam Smith", LocalDate.of(1997, Month.JUNE, 2),
                    "81209438", 20.30, 44);
            hourlyWorkers[1] = new HourlyWorker("Matt Thomas", LocalDate.of(1994, Month.AUGUST, 4),
                    "98765432", 40.70, 30);
            hourlyWorkers[2] = new HourlyWorker("Kyle Lowry", LocalDate.of(1986, Month.MARCH, 25),
                    "76598321", 60.11, 41);

            // Variable for total amount paid
            double totalAmountPaid = 0;

            //Output for array elements
            System.out.println("Employee ID\tName\t\tAmount");
            for (int i = 0; i < salariedEmployees.length; i++){
                totalAmountPaid += salariedEmployees[i].calculatePayDay();
                System.out.println(salariedEmployees[i].getEmployeeID() + "\t" + salariedEmployees[i].getName() + "\t" + salariedEmployees[i].calculatePayDay());
            }
            for (int i = 0; i < hourlyWorkers.length; i++){
                totalAmountPaid += hourlyWorkers[i].calculatePayDay();
                System.out.println(hourlyWorkers[i].getEmployeeID() + "\t" + hourlyWorkers[i].getName() + "\t" + hourlyWorkers[i].calculatePayDay());
            }
            System.out.println("Total pay this week: " + Math.round(totalAmountPaid / 0.01) * 0.01);

        } catch(Exception ex){
            // Exception output
            System.out.println(ex.toString());
        }


    }
}
