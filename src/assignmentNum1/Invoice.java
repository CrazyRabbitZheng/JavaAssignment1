package assignmentNum1;


/**
 * create the Invoice class
 * @author - Stu.ID: 20085058
 */
public class Invoice {

    private LineItem lineItem1;
    private LineItem lineItem2;
    private LineItem lineItem3;

    /**
     * create the constructor of Invoice class
     * @param lineItem1--the first item on the invoice
     * @param lineItem2--the second item on the invoice
     * @param lineItem3--the 3rd item on the invoice
     */

    public Invoice(LineItem lineItem1, LineItem lineItem2, LineItem lineItem3) {
        this.lineItem1 = lineItem1;
        this.lineItem2 = lineItem2;
        this.lineItem3 = lineItem3;
    }


    /**
     * getter for lineItem1
     * @return lineItem1
     */
    public LineItem getLineItem1() {
        return lineItem1;
    }

    /**
     * setter for lineItem1
     * @param lineItem1--
     */
    public void setLineItem1(LineItem lineItem1) {
        this.lineItem1 = lineItem1;
    }

    /**
     * getter for lineItem2
     * @return lineItem2
     */
    public LineItem getLineItem2() {
        return lineItem2;
    }

    /**
     * setter for lineItem2
     * @param lineItem2--
     */
    public void setLineItem2(LineItem lineItem2) {
        this.lineItem2 = lineItem2;
    }

    /**
     * getter for lineItem3
     * @return lineItem3
     */
    public LineItem getLineItem3() {
        return lineItem3;
    }

    /**
     * setter for lineItem3
     * @param lineItem3--
     */
    public void setLineItem3(LineItem lineItem3) {
        this.lineItem3 = lineItem3;
    }

    /**
     * create a method to calculate the invoice total
     * @return
     */
    public double getTheInvoiceTotal(){
        return lineItem1.getTotal() + lineItem2.getTotal() + lineItem3.getTotal();
    }

}

