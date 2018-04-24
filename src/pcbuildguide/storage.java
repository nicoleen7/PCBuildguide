/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcbuildguide;

/**
 *
 * @author nicholasroberto
 */
public class storage {
    
    private String vendor;
    private String model;
    private int storage;
    private String type;
    private int price;

    public storage(String vendor, String model, int storage, String type, int price) {
        this.vendor = vendor;
        this.model = model;
        this.storage = storage;
        this.type = type;
        this.price = price;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public int getStorage() {
        return storage;
    }

    public String getType() {
        return type;
    }
    
    public int getPrice() {
        return price;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "storage{" + "vendor=" + vendor + ", model=" + model + ", storage=" + storage + ", type=" + type + ", price=" + price + '}';
    }
  
}
