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
    
    private String model;
    private int watts;
    private int price;

    public powersupply(String model, int watts, int price) {
        this.model = model;
        this.watts = watts;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getWatts() {
        return watts;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "powersupply{" + "model=" + model + ", watts=" + watts + ", price=" + price + '}';
    }
   
}
