package assignmentNum1;

import java.util.Scanner;

/**
 * create a AccountMenu class
 */
public class AccountMenu {
    /**
     * create main method
     * @param args--
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c;// a letter to choose from meun

        Account account = new Account("John Smith",5);
        do{
            printMenu();
            c = Character.toUpperCase(input.next().charAt(0));
            System.out.printf("\nEcho: %c",c);
            if(c=='I'){
                System.out.println("\nNow you are requiring the account information.");


                System.out.printf("Now you are at %s 's account. \n\nThe balance is $%.2f",account.getName(),account.getBalance());
            } else if (c=='C') {
                System.out.println("\nNow you are in the credit page.");

                System.out.println("\nEnter the amount to credit: ");
                double amount = input.nextDouble();
                account.credit(amount);
                if(amount > 0){
                    System.out.printf("You balance is $%.2f after credit.",account.getBalance());
               }

            } else if (c=='D') {
                System.out.println("\nNow you are in the debit page.");
                System.out.println("Enter the amount you want to debit:");
                double debitAmount = input.nextDouble();
                account.debit(debitAmount);
            } else if (c=='R') {
                System.out.println("\nYour account is resetting...");
                account.reset();
                System.out.printf("Now you have $%.2f in your account.",account.getBalance());
            }
        }while(c!='Q');
        System.out.println("\nGoodbye!");
    }

    /**
     * create printMenu method
     */
    public static void printMenu(){
        System.out.println("\n\nMake a choice:");
        System.out.println("(I) option: show account information.");
        System.out.println("(C) option: to credit.");
        System.out.println("(D) option: to debit.");
        System.out.println("(R) option: to reset account.");
        System.out.println("Enter your choice:");
    }
}
