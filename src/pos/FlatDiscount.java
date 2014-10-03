package pos;

/**
 * A discount Strategy that uses a flat discount off the item price
 * @version 0.1
 * @author Tim Christensen
 */
public class FlatDiscount implements DiscountStrategy {

    private double discount;

    /**
     * Default constructor that sets the discount to 25 off
     */
    public FlatDiscount() {
        setFlatDiscount(25);
    }
    /**
     * Constructor that allows you to set the flat discount to take off
     * @param discount the amount to discount the item by
     */
    public FlatDiscount(double discount) {
        setFlatDiscount(discount);
    }


    /**
     * Returns the discounted price of a product cost
     * @param cost the cost of the product
     * @param qty the quantity of the product
     * @return the discounted price of the product
     */
    @Override
    public double getDiscountPrice(double cost, int qty) {

        return (cost * qty) - (discount * qty);
    }

    /**
     * Sets the discount price
     * @param discount amount to set the discount to
     */
    public void setFlatDiscount(double discount) {
        this.discount = discount;
    }
    /**
     * Get the current Flat discount price
     * @return the discount
     */
    public double getFlatDiscount() {
        return discount;
    }
}
