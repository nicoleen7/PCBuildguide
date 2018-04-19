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
public class cpu {
    
    private String vendor;
    private String model;
    private double baseclock;
    private double boostclock;
    private int cores;
    private int threads;
    private int tdp;
    private String socket;
    private int price;

    public cpu(String vendor, String model, double baseclock, double boostclock, int cores, int threads, int tdp, String socket, int price) {
        this.vendor = vendor;
        this.model = model;
        this.baseclock = baseclock;
        this.boostclock = boostclock;
        this.cores = cores;
        this.threads = threads;
        this.tdp = tdp;
        this.socket = socket;
        this.price = price;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public double getBaseclock() {
        return baseclock;
    }

    public double getBoostclock() {
        return boostclock;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    public int getTdp() {
        return tdp;
    }

    public String getSocket() {
        return socket;
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

    public void setBaseclock(double baseclock) {
        this.baseclock = baseclock;
    }

    public void setBoostclock(double boostclock) {
        this.boostclock = boostclock;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public void setTdp(int tdp) {
        this.tdp = tdp;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "cpu{" + "vendor=" + vendor + ", model=" + model + ", baseclock=" + baseclock + ", boostclock=" + boostclock + ", cores=" + cores + ", threads=" + threads + ", tdp=" + tdp + ", socket=" + socket + ", price=" + price + '}';
    }
    
    
}
