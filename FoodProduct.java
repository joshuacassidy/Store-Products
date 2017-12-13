/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeproducts;

/**
 *
 * @author Josh
 */
public class FoodProduct extends Product {
    
    private String expirationDate;
    
    public FoodProduct(String name, String description, double price, String expirationDate) {
        super(name, description, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
    
}
