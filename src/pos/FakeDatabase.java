package pos;

/**
 * A fake database for testing purposes
 * @author Tim Christensen
 * @version 0.1
 */
public class FakeDatabase implements DataAccessStrategy {

    private Product product;
    private Customer customer;
    
    private Customer[] customers = {
        new Customer("John Doe", "001C"),
        new Customer("Jane Doe", "002C"),
        new Customer("Robert Doe", "003C")
    };
    
    private Product[] products = {
        new Product("115A", "Coffee Pot", "A fine quality Coffee Pot", 45, 19.99, new FlatDiscount(5)),
        new Product("116A", "Coffee Mug", "A Coffee Mug", 135, 4.99, new NoDiscount()),
        new Product("117A", "Coffee Filter", "Coffee Filters", 500, 0.00, new NoDiscount())
        
    };

    /**
     * Gets a product by ID
     * @param id the id of the product you wish to find
     * @return product object
     */
    @Override
    public Product getProduct(String id) {
        for(Product p : products) {
           if(id.equals(p.getProductID())) {
               product = p;
               break;
           }
        }
        return product;
    }

    /**
     * Gets a customer by ID
     * @param id the id of the customer you wish to find
     * @return customer object
     */
    @Override
    public Customer getCustomer(String id) {
        for(Customer c : customers) {
            if(id.equals(c.getCustomerID())) {
                customer = c;
                break;
            }
        }
        return customer;
    }
    
}
