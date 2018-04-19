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
public class gpu {
    
    private String vendor;
    private String make;
    private String model;
    private int coreclock;
    private int memoryclock;
    private String memorytype;
    private int powerdraw;
    private boolean rgb;
    private int price;

    public gpu(String vendor, String make, String model, int coreclock, int memoryclock, String memorytype, int powerdraw, boolean rgb, int price) {
        this.vendor = vendor;
        this.make = make;
        this.model = model;
        this.coreclock = coreclock;
        this.memoryclock = memoryclock;
        this.memorytype = memorytype;
        this.powerdraw = powerdraw;
        this.rgb = rgb;
        this.price = price;
    }

    public String getVendor() {
        return vendor;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCoreclock() {
        return coreclock;
    }

    public int getMemoryclock() {
        return memoryclock;
    }

    public String getMemorytype() {
        return memorytype;
    }

    public int getPowerdraw() {
        return powerdraw;
    }
    
    public boolean getRgb() {
        return rgb;
    }
    
    public int getPrice() {
        return price;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCoreclock(int coreclock) {
        this.coreclock = coreclock;
    }

    public void setMemoryclock(int memoryclock) {
        this.memoryclock = memoryclock;
    }

    public void setMemorytype(String memorytype) {
        this.memorytype = memorytype;
    }

    public void setPowerdraw(int powerdraw) {
        this.powerdraw = powerdraw;
    }
    
    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "gpu{" + "vendor=" + vendor + ", make=" + make + ", model=" + model + ", coreclock=" + coreclock + ", memoryclock=" + memoryclock + ", memorytype=" + memorytype + ", powerdraw=" + powerdraw + ", rgb=" + rgb + ", price=" + price + '}';
    }
   
    
}
