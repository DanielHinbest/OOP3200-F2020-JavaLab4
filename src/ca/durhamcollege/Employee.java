package ca.durhamcollege;

import java.time.LocalDate;
import java.util.InputMismatchException;

public abstract class Employee extends Person {
    protected String employeeID;

    public Employee(String fullName, LocalDate birthDate, String id){
        super(fullName, birthDate);

        try {
            if (employeeID.length() != 8){
                throw new InputMismatchException();
            }
            else{
                employeeID = id;
            }
        } catch (InputMismatchException ex){
            System.out.println("The employee ID must be 8 digits long");
        }
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public double calculatePayDay(){
        return 0;
    }

}
