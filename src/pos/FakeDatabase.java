package pos;

/**
 * Created by Timothy on 9/30/2014.
 */
public class FakeDatabase implements DataAccessStrategy {

    private Customer[] customers = {
        new Customer("John Doe", "1234qwer"),
        new Customer("Jane Doe", "34567qwer"),
        new Customer("Robert Doe", "3456qwer")
    };
    
    private Product[] products = {
        new Product("115-ATT", "Coffee Pot", "A fine quality Coffee Pot", 45, 19.99, new FlatDiscount()),
        new Product("115-ATY", "Coffee Mug", "A Coffee Mug", 135, 4.99, new QuantityDiscount()),
        new Product("115-ATU", "Coffee Filter", "Coffee Filters", 500, 0.00, new NoDiscount())
        
    };

    @Override
    public Product getProduct(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomer(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
