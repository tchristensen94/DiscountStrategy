package pos;

/**
 * Created by Timothy on 9/30/2014.
 */
public class Register {
    private Receipt receipt;
    
    
    public Register() {
        
    }
    
    public void startTransaction(String customerID, DataAccessStrategy db) {
        receipt = new Receipt(customerID, db);
    }
    
    public void addItem(String productID, int quantity) {
        receipt.addLineItem(productID, quantity);
    }

}
