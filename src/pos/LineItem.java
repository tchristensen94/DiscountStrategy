package pos;

/**
 * Created by Timothy on 9/30/2014.
 */
public class LineItem {
    
    private DataAccessStrategy db;
    private Product product;
    private int quantity;
    
    public LineItem(String productID, DataAccessStrategy db, int quantity) {
        this.db = db;
        this.quantity = quantity;
        product = db.getProduct(productID);
    }
    
    public double getTotalDiscount() {
        return 0.0;
    }
    
    public double getLineItemTotal() {
        return 0.0;
    }
    
}
