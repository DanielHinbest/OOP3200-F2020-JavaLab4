/* Program Name: OOP 3200 - Java Lab 4 - Employee
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: December 12, 2020
 * Description: Uses abstract classes and polymorphism
 */
package ca.durhamcollege;

import java.time.LocalDate;
import java.util.InputMismatchException;

public abstract class Employee extends Person {
    //Variable declaration for Employee ID
    protected String employeeID;

    // Parameterized constructor for employee
    public Employee(String fullName, LocalDate birthDate, String id){
        super(fullName, birthDate);

        // Exception handling for ID
        try {
            if (id.length() != 8){
                throw new InputMismatchException();
            }
            else{
                employeeID = id;
            }
        } catch (InputMismatchException ex){
            // Exception output
            System.out.println("The employee ID must be 8 digits long");
        }
    }

    // Accessor for employee ID
    public String getEmployeeID() {
        return employeeID;
    }

    // Base method for calculatePayDay()
    public double calculatePayDay(){
        return 0;
    }

}
