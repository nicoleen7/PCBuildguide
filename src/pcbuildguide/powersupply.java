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
public class powersupply {
    
    private String vendor;
    private String model;
    private String formfactor;
    private String involtage;
    private int wattage;

    public powersupply(String vendor, String model, String formfactor, String involtage, int wattage) {
        this.vendor = vendor;
        this.model = model;
        this.formfactor = formfactor;
        this.involtage = involtage;
        this.wattage = wattage;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public String getFormfactor() {
        return formfactor;
    }

    public String getInvoltage() {
        return involtage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFormfactor(String formfactor) {
        this.formfactor = formfactor;
    }

    public void setInvoltage(String involtage) {
        this.involtage = involtage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "powersupply{" + "vendor=" + vendor + ", model=" + model + ", formfactor=" + formfactor + ", involtage=" + involtage + ", wattage=" + wattage + '}';
    }
    
}
