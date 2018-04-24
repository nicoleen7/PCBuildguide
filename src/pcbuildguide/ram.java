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
public class ram {
    
    private String vendor;
    private String model;
    private String platform;
    private int size;
    private int frequency;
    private boolean rgb;
    private double voltage;
    private int channels;
    private int price;

    public ram(String vendor, String model, String platform, int size, int frequency, boolean rgb, double voltage, int channels, int price) {
        this.vendor = vendor;
        this.model = model;
        this.platform = platform;
        this.size = size;
        this.frequency = frequency;
        this.rgb = rgb;
        this.voltage = voltage;
        this.channels = channels;
        this.price = price;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public String getPlatform() {
        return platform;
    }
    
    public int getSize() {
        return size;
    }

    public int getFrequency() {
        return frequency;
    }

    public boolean isRgb() {
        return rgb;
    }

    public double getVoltage() {
        return voltage;
    }

    public int getChannels() {
        return channels;
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

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    public void setSize(int size) {
        this.size = size;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ram{" + "vendor=" + vendor + ", model=" + model + ", platform=" + platform + ", frequency=" + frequency + ", rgb=" + rgb + ", voltage=" + voltage + ", channels=" + channels + ", price=" + price + '}';
    }

    
    
}
