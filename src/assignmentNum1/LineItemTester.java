package assignmentNum1;

/**
 * create a LineItemTester class
 @author - Stu.ID: 20085058
 */
public class LineItemTester {
    /**
     * create a main method
     * @param args--
     */
    public static void main(String[] args) {

        LineItem something1 = new LineItem(new Product(2,"Something1 is \"socks\"",12),23);
       // System.out.printf("LineItem: %s %d\nThe total price is $%.2f",something1.getProduct(),something1.getQuantity(),something1.getTotal());
        //%s for product? I was not clear about what I want to display.
        //below something1.getProduct().getDescription() is like many layers. take it one by one.

        System.out.printf("LineItem: %s \nQuantity: %d\nUnit price: $%.2f",
                something1.getProduct().getDescription(),something1.getQuantity(),something1.getProduct().getPrice());
        System.out.printf("\nTotal price: $%.2f",something1.getTotal());
    }

}
