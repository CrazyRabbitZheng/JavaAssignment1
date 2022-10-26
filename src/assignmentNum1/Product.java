package assignmentNum1;

/**
 * create Product class
 * @author - Stu.ID: 20085058
 */
public class Product {

   private int id;
   private String description;
   private double price;

    /**
     * constructor takes 3 parameters: id,description, price
     * @param id--product id
     * @param description--
     * @param price--unit price
     */
   public Product(int id, String description, double price) {
        if(id > 0){
            this.id = id;
        }
        this.description = description;
        if(price > 0){
            this.price = price;
        }
    }

    /**
     * getter for id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * setter for id
     * @param id--
     */
    public void setId(int id) {
        if(id > 0){
            this.id = id;
        }
    }

    /**
     * getter for description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * setter for description
     * @param description--
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getter for price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * setter for price
     * @param price--
     */
    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }
    }
}
