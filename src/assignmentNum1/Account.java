package assignmentNum1;


/**
 * create Account class
 */
public class Account {
    private String name;
    private double balance;

//Fn + alt + insert to generate the constructor automatically

    /**
     * Build the constructor for Account class.
     *
     * @param name--user name
     * @param balance--user balance
     */
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
        }
    }
//generate getter and setter automatically

    /**
     * getter for name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name
     * @param name-- user name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * create credit method
     * a user can not credit a negative value.
     * @param amount-- the money you want to deposit
     */
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else if (amount == 0) {
            System.out.println("You did not enter a positive value. \nYour balance remains unchanged.");
        } else {
            System.out.println("You can not credit negative value. \nYour balance remains unchanged.");
        }
    }

    /**
     * create debit method
     * a user can not debit more than the account balance.
     * a user can not debit a negative value.
     * @param debitAmount-- the money you want to withdraw
     */
    public void debit(double debitAmount) {
        if(debitAmount < 0){
            System.out.println("You can not debit a negative value.");
        }else{
            if (balance - debitAmount >= 0) {
                balance = balance - debitAmount;
                System.out.printf("You have debited $%.2f.\nNow you have $%.2f in your account.", debitAmount, getBalance());
            } else {
                System.out.println("Debit amount exceeded account balance.");
                System.out.println("Your balance remains unchanged.");
            }
        }

    }
    /**
     * create reset method
     */
    public void reset() {
        this.balance = 0;
    }
}
