package pos;

import java.text.DecimalFormat;

/**
 * A line item of a receipt
 * @author Timothy
 * @version 0.1
 */
public class LineItem {
    
    private DataAccessStrategy db;
    private Product product;
    private int quantity;

    /**
     * Creates a new LineItem Object
     * @param productID the ID of the product
     * @param db the database to pull the Product From
     * @param quantity quantity of the product purchased
     */
    public LineItem(String productID, DataAccessStrategy db, int quantity) {
        this.db = db;
        this.quantity = quantity;
        this.product = loadProduct(productID);

    }

    /**
     * Gets a product by id from the current db strategy
     * @param pid the product ID
     * @return the product
     */
    public Product loadProduct(String pid) {
        return db.getProduct(pid);
    }

    /**
     * Returns the current product
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Gets the current total price of the line item
     * @return the undiscounted total price
     */
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    /**
     * Gets the discounted price of the product
     * @return the discounted price
     */
    public double getDiscountedPrice() {
        return product.getDiscountStrategy().getDiscountPrice(product.getPrice(), quantity);
    }

    /**
     * Gets the quantity
     * @return quantity of the item
     */
    public int getQty() {
        return quantity;
    }

    /**
     * Sets product of the line item
     * @param product the product you wish to replace current product with
     */
    public void setProduct(Product product) {
        if(product != null) {
            this.product = product;
        } else {
            throw new IllegalArgumentException();
        }
    }


    
}
