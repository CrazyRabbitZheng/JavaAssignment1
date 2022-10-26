package assignmentNum1;

/**
 * create ProductTester class
 * @author - Stu.ID: 20085058
 */
public class ProductTester {
    /**
     * create a main method
     * @param args--
     */
    public static void main(String[] args) {
        System.out.println("^_^ Now you are at ProductTester");
        Product socks = new Product(1, "Nice socks", 0.55);
        Product pants = new Product(33, "Cheap pants", 12);

        System.out.printf("Product ID: %d",socks.getId());
        System.out.printf("\nDescription: %s", socks.getDescription());
        System.out.printf("\nUnit price: $%.2f",socks.getPrice());
        System.out.printf("\n\nProduct ID: %d",pants.getId());
        System.out.printf("\nDescription: %s", pants.getDescription());
        System.out.printf("\nUnit price: $%.2f",pants.getPrice());
    }

}
