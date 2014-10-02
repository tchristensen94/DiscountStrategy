package pos;

/**
 * This class represents a simulation of a real receipt in a retail sales 
 * situation. It is responsible for managing miscellaneous receipts.
 * @author Tim Christensen
 * @version 0.01
 */
public class Receipt {
    
    private DataAccessStrategy db;
    private LineItem[] lineItems;
    private String receiptID;
    private LineItem item;
    
    public Receipt(String id, DataAccessStrategy db) {
        this.db = db;
        receiptID = id;
    }
    
    /**
     * Adds a line item to a receipt
     * @param productID unique identifier for product
     * @param qty quantity of the product purchased
     */
    public final void addLineItem(final String productID, final int qty) {
        item = new LineItem(productID, db, qty);
        addToArray(item);
        
    }
    
    /**
     * A method to resize an array.
     * Creates a temporary array one larger, copies over and adds the item
     * then set the old array to the new array
     * @param item 
     */
    private void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
}
