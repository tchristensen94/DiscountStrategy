package pos;

import java.text.NumberFormat;

/**
 * This class represents a simulation of a real receipt in a retail sales 
 * situation. It is responsible for managing miscellaneous receipts.
 * @author Tim Christensen
 * @version 0.01
 */
public class Receipt {
    
    private DataAccessStrategy db;
    private LineItem[] lineItems;
    private Customer customer;
    private static int receiptNumber = 0;
    private OutputStrategy output;
    
    public Receipt(String id, DataAccessStrategy db) {
        this.db = db;
        customer = loadCustomer(id);
        lineItems = new LineItem[0];
    }
    
    /**
     * Adds a line item to a receipt
     * @param productID unique identifier for product
     * @param qty quantity of the product purchased
     */
    public final void addLineItem(final String productID, final int qty) {
        LineItem item = new LineItem(productID, db, qty);
        addToArray(item);
        receiptNumber++;
        
    }

    /**
     * Finds customer by ID
     * @param id the id of the customer to find
     * @return the customer
     */
    public Customer loadCustomer(String id) {
        return db.getCustomer(id);
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

    /**
     * Outputs a message to the currently set output strategy
     * @param msg the message you wish to send
     */
    public void outputMsg(String msg) {
        output.outputMessage(msg);
    }

    /**
     * Gets the total before discounts from all current line items
     * @return the total amount
     */
    public double getPreDiscountTotal() {
        double total = 0.0;
        for(LineItem item : lineItems) {
            total += item.getTotalPrice();
        }
        return total;
    }

    /**
     * Gets the total discount of the items
     * @return the total discount
     */
    public double getDiscount() {
        double total = 0.0;
        for(LineItem item : lineItems) {
            total += item.getDiscountedPrice();
        }
        return total;
    }

    /**
     * Sets the database
     * @param db new database to set to
     */
    public void setDatabase(DataAccessStrategy db) {
        if(db == null) {
            throw new IllegalArgumentException();
        }
        this.output = output;
    }

    /**
     * Sets the current output
     * @param os new output to set to
     */
    public void setOutput(OutputStrategy os) {
        if(os == null) {
            throw new IllegalArgumentException();
        }
        this.output = os;
    }

    /**
     * Outputs the receipt to the current output strategy
     */
    public void printReceipt() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        StringBuilder data = new StringBuilder("Thanks for shopping at Kohls!\n");
        data.append("Customer: ").append(customer.getCustomerName()).append("\n");
        data.append("Receipt Number: ").append(Receipt.receiptNumber).append("\n\n");
        data.append("ID\tProduct\t\t\tPrice\tQty\tSubtotal\tDiscount").append("\n");
        for(LineItem i: lineItems) {
            data.append(i.getProduct().getProductID()).append("\t");
            data.append(i.getProduct().getTitle()).append("\t");
            data.append(nf.format(i.getProduct().getPrice())).append("\t");
            data.append(i.getQty()).append("\t");
            data.append(i.getTotalPrice()).append("\t");
            data.append(nf.format(i.getDiscountedPrice())).append("\t");
        }

        data.append("\n");
        data.append("\t\t\t\t\t\t\t\t--------\n");
        double net = getPreDiscountTotal();
        data.append("\t\t\t\t\t\tNet Total: ").append(nf.format(net)).append("\n");
        double discount = getDiscount();
        data.append("\t\t\t\t\t\tTotal Saved: ").append(nf.format(discount)).append("\n");
        data.append("\t\t\t\t\t\tTotal Due: ").append(nf.format(net -discount)).append("\n");

        output.outputReceipt(data.toString());

    }





}
