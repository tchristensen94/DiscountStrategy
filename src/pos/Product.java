package pos;

/**
 * Created by Timothy on 9/30/2014.
 */
public class Product {

    private String productID;
    private String title;
    private String description;
    private double price;
    private int quantity;
    private DiscountStrategy discountStrategy;

    public final String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }


    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        this.productID = productID;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        this.description = description;
    }

    public final int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public final DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public final void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public Product(String id, String title, String description, int quantity, double price, DiscountStrategy ds) {
        setProductID(id);
        setTitle(title);
        setDescription(description);
        setQuantity(quantity);
        setPrice(price);
        setDiscountStrategy(ds);
    }
}
