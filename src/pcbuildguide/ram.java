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
    private double frequency;
    private boolean rgb;
    private double voltage;

    public ram(String vendor, String model, String platform, double frequency, boolean rgb, double voltage) {
        this.vendor = vendor;
        this.model = model;
        this.platform = platform;
        this.frequency = frequency;
        this.rgb = rgb;
        this.voltage = voltage;
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

    public double getFrequency() {
        return frequency;
    }

    public boolean isRgb() {
        return rgb;
    }

    public double getVoltage() {
        return voltage;
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

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "ram{" + "vendor=" + vendor + ", model=" + model + ", platform=" + platform + ", frequency=" + frequency + ", rgb=" + rgb + ", voltage=" + voltage + '}';
    }
    
}
