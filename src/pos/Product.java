package pos;

/**
 * A product class
 * @author Timothy
 * @version 0.1
 */
public class Product {

    private String productID;
    private String title;
    private double price;
    private DiscountStrategy discountStrategy;

    public Product(String id, String title, int quantity, double price, DiscountStrategy ds) {
        setProductID(id);
        setTitle(title);
        setPrice(price);
        setDiscountStrategy(ds);
    }

    /**
     * Returns the product Title
     * @return the product title
     */
    public final String getTitle() {
        return title;
    }

    /**
     * Sets the product title
     * @param title new title to set
     */
    public final void setTitle(String title) {
        if(title == null || title.length() < 1) {
            throw new IllegalArgumentException();
        }
        this.title = title;
    }

    /**
     * Gets the product ID
     * @return the product ID
     */
    public final String getProductID() {
        return productID;
    }

    /**
     * Sets the product ID
     * @param productID the new Product ID
     */
    public final void setProductID(String productID) {
        if(productID == null || productID.length() < 1) {
            throw new IllegalArgumentException();
        }
        this.productID = productID;
    }

    /**
     * Gets the current price
     * @return the product price
     */
    public final double getPrice() {
        return price;
    }

    /**
     * Sets the product price
     * @param price the price to set it as
     */
    public final void setPrice(double price) {
        if(price < 0) {
            throw new IllegalArgumentException();
        }
        this.price = price;
    }

    /**
     * Gets the discount strategy of the product
     * @return the discount strategy
     */
    public final DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    /**
     * Sets the product's discount strategy
     * @param discountStrategy
     */
    public final void setDiscountStrategy(DiscountStrategy discountStrategy) {
        if(discountStrategy == null) {
            throw new IllegalArgumentException();
        }
        this.discountStrategy = discountStrategy;
    }


}
