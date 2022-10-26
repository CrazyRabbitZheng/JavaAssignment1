
package assignmentNum1;

import java.util.Scanner;

/**
 * Tester
 * @author - Stu.ID: 20085058
 */

/**
 * create a AccountTester class
 */
public class AccountTester {
    /**
     * create a main method
     * @param args--
     */
    public static void main(String[] args) {
        System.out.println("^_^ Now you are at AccountTester\n\n");

        Account account = new Account("John Smith",5);

        System.out.printf("Now you are at %s 's account. \n\nThe balance is $%.2f",account.getName(),account.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the amount to credit: ");
        double amount = input.nextDouble();
        account.credit(amount);
        if(amount > 0){
            System.out.printf("You balance is $%.2f after credit.",account.getBalance());
        }
        System.out.println("\nEnter the amount to debit: ");
        double debitAmount = input.nextDouble();
        account.debit(debitAmount);
        System.out.println("\nDo you want to reset your account? (y/n)");
        char c;
        c = Character.toUpperCase(input.next().charAt(0));
        if(c=='Y'){
            account.reset();
            System.out.printf("Now you have $%.2f in your account.",account.getBalance());
        }

}




}
