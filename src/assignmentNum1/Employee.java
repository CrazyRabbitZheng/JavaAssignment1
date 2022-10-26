package assignmentNum1;

/**
 * create an Employee class with fields firstName,lastName,monthlySalary
 * @author - Stu.ID: 20085058
 */

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    /**
     * constructor of the employee class.
     * @param firstName--
     * @param lastName--
     * @param monthlySalary--
     */
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(monthlySalary > 0){
            this.monthlySalary = monthlySalary;
        }

    }

    /**
     * getter for firstName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setter for firstName
     * @param firstName--
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getter for lastName
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setter for lastName
     * @param lastName--
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getter for monthlySalary
     * @return monthlySalary
     */
    public double getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * setter for monthlySalary
     * @param monthlySalary--can not be negative
     */
    public void setMonthlySalary(double monthlySalary) {

        if(monthlySalary > 0){
            this.monthlySalary = monthlySalary;
        }

    }
}
