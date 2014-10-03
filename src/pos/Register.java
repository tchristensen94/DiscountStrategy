package pos;

/**
 * A register class for interfacing with a receipt
 * Used to create/end transactions and add items to the receipt
 * Created by Timothy on 9/30/2014.
 */
public class Register {
    private Receipt receipt;
    
    
    public Register() {
        
    }

    /**
     * Starts a new transaction
     * @param customerID the id of the customer
     * @param db the db access strategy
     */
    public void startTransaction(String customerID, DataAccessStrategy db, OutputStrategy os) {
        if(os == null || db == null || customerID == null || customerID.length() == 0) {
            receipt.outputMsg("Invalid customer Id/Database/Output");
            return;
        }

        receipt = new Receipt(customerID, db, os);
    }

    /**
     * Adds item to the receipt
     * @param productID Product ID to add
     * @param quantity quantity of the product
     */
    public void addItem(String productID, int quantity) {
        if(productID == null || productID.length() == 0 || quantity < 1) {
            receipt.outputMsg("Invalid product ID or quantity");
            return;
        }
        receipt.addLineItem(productID, quantity);
    }

    /**
     * Ends the transaction and prints the receipt
     */
    public void endTransaction() {
        receipt.printReceipt();
    }

}
