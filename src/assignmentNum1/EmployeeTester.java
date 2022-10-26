package assignmentNum1;

/**
 * create a EmployeeTester class
 * @author - Stu.ID: 20085058
 */



public class EmployeeTester {
    /**
     * create a main method
     * @param args--
     */
    public static void main(String[] args) {
        System.out.println("^_^ Now you are at EmployeeTester");

        Employee one = new Employee("John","King",10);
        Employee two =new Employee("Jenifer","Campus",100);

        System.out.printf("%s %s's yearly salary is $%.2f.\nAfter a 10%% raise in salary,the new yearly salary is $%.2f.",
                one.getFirstName(),one.getLastName(),12*one.getMonthlySalary(),12*one.getMonthlySalary()*1.1);
        System.out.printf("\n\n%s %s's yearly salary is $%.2f.\nAfter a 10%% raise in salary,the new yearly salary is $%.2f.",
                two.getFirstName(),two.getLastName(),12*two.getMonthlySalary(),12* two.getMonthlySalary()*1.1);
    }

}
