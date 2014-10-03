package pos;

/**
 * An interface for creating discounts
 * @author Tim Christensen
 * @version 0.1
 */
public interface DiscountStrategy {
    /**
     * Get the discount price of a product cost
     * @param cost cost of the product
     * @param qty quantity of the product
     * @return discount price of the product
     */
    public abstract double getDiscountPrice(double cost, int qty);
}
