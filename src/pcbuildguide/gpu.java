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
    private double coreclock;
    private double memoryclock;
    private String memorytype;
    private int powerdraw;
    private boolean rgb;

    public gpu(String vendor, String make, String model, double coreclock, double memoryclock, String memorytype, int powerdraw) {
        this.vendor = vendor;
        this.make = make;
        this.model = model;
        this.coreclock = coreclock;
        this.memoryclock = memoryclock;
        this.memorytype = memorytype;
        this.powerdraw = powerdraw;
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

    public double getCoreclock() {
        return coreclock;
    }

    public double getMemoryclock() {
        return memoryclock;
    }

    public String getMemorytype() {
        return memorytype;
    }

    public int getPowerdraw() {
        return powerdraw;
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

    public void setCoreclock(double coreclock) {
        this.coreclock = coreclock;
    }

    public void setMemoryclock(double memoryclock) {
        this.memoryclock = memoryclock;
    }

    public void setMemorytype(String memorytype) {
        this.memorytype = memorytype;
    }

    public void setPowerdraw(int powerdraw) {
        this.powerdraw = powerdraw;
    }

    @Override
    public String toString() {
        return "gpu{" + "vendor=" + vendor + ", make=" + make + ", model=" + model + ", coreclock=" + coreclock + ", memoryclock=" + memoryclock + ", memorytype=" + memorytype + ", powerdraw=" + powerdraw + '}';
    }
    
    
    
}
