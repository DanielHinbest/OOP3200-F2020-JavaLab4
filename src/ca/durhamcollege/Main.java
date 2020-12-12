package ca.durhamcollege;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args)
    {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel Hinbest",
                LocalDate.of(2001, Month.AUGUST, 14), "12345678", 60000);
        HourlyWorker hourlyWorker = new HourlyWorker("Ryan Clayson",
                LocalDate.of(1996, Month.NOVEMBER, 16), "87654321", 17.00, 48);

        System.out.println("Daniel's Salary\n---------------");
        System.out.println(salariedEmployee.getName() + ": $" + salariedEmployee.getAnnualSalary());
        salariedEmployee.setAnnualSalary(60001);
        System.out.println("\nDaniel's Updated Salary\n-------------------------");
        System.out.println(salariedEmployee.getName() + "'s new salary: $" + salariedEmployee.getAnnualSalary());

        System.out.println("\nRyan's Hourly Rate and Number of Hours\n---------------------------------------------");
        System.out.println(hourlyWorker.getName() + ": $" + hourlyWorker.getHourlyRate() + " per hour, "
                + hourlyWorker.getHoursPerWeek() + " hours per week");

        System.out.println("\nRyan's Updated Hourly Rate and Number of Hours\n----------------------------------------------");
        hourlyWorker.setHourlyRate(25.00);
        hourlyWorker.setHoursPerWeek(40);
        System.out.println(hourlyWorker.getName() + ": $" + hourlyWorker.getHourlyRate() + " per hour, "
                + hourlyWorker.getHoursPerWeek() + " hours per week");

        try {
            SalariedEmployee[] salariedEmployees = new SalariedEmployee[2];
            HourlyWorker[] hourlyWorkers = new HourlyWorker[3];

            salariedEmployees[0] = new SalariedEmployee("Jane Doe", LocalDate.of(1990, Month.AUGUST, 21),
            "62784363", 40000);
            salariedEmployees[1] = new SalariedEmployee("John Doe", LocalDate.of(1989, Month.JULY, 12),
                    "63729482", 50000);

            hourlyWorkers[0] = new HourlyWorker("Adam Smith", LocalDate.of(1997, Month.JUNE, 2),
                    "81209438", 20.30, 44);
            hourlyWorkers[1] = new HourlyWorker("Matt Thomas", LocalDate.of(1994, Month.AUGUST, 4),
                    "98765432", 40.70, 30);
            hourlyWorkers[2] = new HourlyWorker("Kyle Lowry", LocalDate.of(1986, Month.MARCH, 25),
                    "76598321", 60.11, 41);

            double totalAmountPaid = 0;

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
            System.out.println(ex.toString());
        }


    }
}
