package pos;

/**
 * Used to offer a percentage based discount on an item
 * @version 0.1
 * @author Tim Christensen
 */
public class PercentageDiscount implements DiscountStrategy {

    private double percentage;

    /**
     * Default percentage discount constructor
     * Sets the default percent to 10%
     */
    public PercentageDiscount() {
        setPercentage(0.10);
    }
    /**
     * User defined percentage discount constructor
     * @param percentage the percentage to take off
     */
    public PercentageDiscount(double percentage) {
        setPercentage(percentage);
    }
    /**
     * Returns the discounted price for a product cost
     * @param cost the cost of the product
     * @param qty
     * @return the discounted price
     */
    @Override
    public double getDiscountPrice(double cost, int qty) {

        return cost * qty * percentage;
    }
    /**
     * Sets the percentage to be taken off the price
     * @param percentage percentage to take off
     */
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    /**
     * Returns the current % that will be removed from the price
     * @return  the current percentage to take off the item price
     */
    public double getPercentage() {
        return percentage;
    }
}
