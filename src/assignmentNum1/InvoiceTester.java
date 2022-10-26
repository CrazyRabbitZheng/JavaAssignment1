package assignmentNum1;

import java.util.Scanner;

/**
 * create an InvoiceTester class
 *@author - Stu.ID: 20085058
 */
public class InvoiceTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("^_^ Now you are at InvoiceTester");
       // System.out.println("Please enter the line number: ");

        /**
         * create a new instance of blank line item
         */

        LineItem blankSample = new LineItem(new Product(0,"",0),0);
        Invoice myInvoice = new Invoice(new LineItem(new Product(89,"Pens",0.5),10),
                new LineItem(new Product(10,"Phones",100),1),
                new LineItem(new Product(30,"Erasers",0.12),5));

        LineItem lineItem1 = new LineItem(new Product(89,"Pens",0.5),10);

        LineItem lineItem2 = new LineItem(new Product(10,"Phones",100),1);

        LineItem lineItem3 = new LineItem(new Product(30,"Erasers",0.12),5);

        System.out.println("Here is your invoice.\n");
        System.out.printf("LineItem1: %s\n",lineItem1.getProduct().getDescription());
        System.out.printf("Unit price: $%.2f\n",lineItem1.getProduct().getPrice());
        System.out.printf("Qty: %d\n",lineItem1.getQuantity());
        System.out.printf("Subtotal: $%.2f\n\n",lineItem1.getTotal());

        System.out.printf("LineItem2: %s\n",lineItem2.getProduct().getDescription());
        System.out.printf("Unit price: $%.2f\n",lineItem2.getProduct().getPrice());
        System.out.printf("Qty: %d\n",lineItem2.getQuantity());
        System.out.printf("Subtotal: $%.2f\n\n",lineItem2.getTotal());

        System.out.printf("LineItem3: %s\n",lineItem3.getProduct().getDescription());
        System.out.printf("Unit price: $%.2f\n",lineItem3.getProduct().getPrice());
        System.out.printf("Qty: %d\n",lineItem3.getQuantity());
        System.out.printf("Subtotal: $%.2f\n\n",lineItem3.getTotal());

        System.out.printf("Your invoice total is $%.2f",myInvoice.getTheInvoiceTotal());




    }

}
