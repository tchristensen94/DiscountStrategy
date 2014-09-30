package discountstrategy;

/**
 * Created by Timothy on 9/30/2014.
 */
public class ProductInfo {

    private String productID;
    private String title;
    private String description;
    private double price;
    private int quantity;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private DiscountStrategy discountStrategy;


    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductInfo(String id, String title, String description, int quantity, double price) {
        setProductID(id);
        setTitle(title);
        setDescription(description);
        setQuantity(quantity);
        setPrice(price);
    }
}
