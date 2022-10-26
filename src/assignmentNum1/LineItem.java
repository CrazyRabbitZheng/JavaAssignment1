package assignmentNum1;

/**
 * create a LineItem class
 * @author - Stu.ID: 20085058
 */
public class LineItem {

    private Product product;
    private int quantity;

    /**
     * constructor for LineItem class with 2 parameters
     * @param product--
     * @param quantity--
     */
    public LineItem(Product product, int quantity) {
        this.product = product;
        if(quantity > 0){
            this.quantity = quantity;
        }
    }

    /**
     * getter for product
     * @return product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * setter for product
     * @param product--
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * getter for quantity
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * setter for quantity
     * @param quantity--
     */
    public void setQuantity(int quantity) {
        if(quantity > 0){
            this.quantity = quantity;
        }
    }

    /**
     * create a method to calculate the total price
     * it needs to return the total price
     */
    public double getTotal(){
        return quantity * product.getPrice();//I was using the "P"roduct and didn't work
        //Also there can be an expression after keyword "return"
        //I was doing it in the wrong way; public void getTotal(){double total = the calculation}
        //I needed it to return a value like the right way above.
    }
}
