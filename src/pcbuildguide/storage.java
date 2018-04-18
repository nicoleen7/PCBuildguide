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
    private double storage;
    private String connectiontype;

    public storage(String vendor, String model, double storage, String connectiontype) {
        this.vendor = vendor;
        this.model = model;
        this.storage = storage;
        this.connectiontype = connectiontype;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public double getStorage() {
        return storage;
    }

    public String getConnectiontype() {
        return connectiontype;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    public void setConnectiontype(String connectiontype) {
        this.connectiontype = connectiontype;
    }
    
}
