/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import pos.Customer;
import pos.Product;

/**
 *
 * @author Timothy
 */
public interface DataAccessStrategy {
    
    
    public Product getProduct(String id);
    public Customer getCustomer(String id);
}
