/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *A discount strategy that offers no discount
 * @author Timothy
 * @version 0.01
 */
public class NoDiscount implements DiscountStrategy{
    
    /**
     * Gets the discounted price of product cost
     * @param cost the cost of the item
     * @param qty
     * @return the discounted price
     */
    @Override
    public double getDiscountPrice(double cost, int qty) {
        return 0;
    }
    
}
