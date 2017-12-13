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
public class ElectronicProduct extends Product {
    private String batteryType;
    
    public ElectronicProduct(String name, String description, double price, String batteryType) {
        super(name, description, price);
        this.batteryType = batteryType;
    }

    public String getBatteryType() {
        return batteryType;
    }

}
