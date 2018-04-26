/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcbuildguide;

/**
 *
 * @author nicholasroberto and geoffreysalfi
 */
public class mobo {
    
    private String make;
    private String model;
    private String socket;
    private int price;

    public mobo(String make, String model, String socket, int price) {
        this.make = make;
        this.model = model;
        this.socket = socket;
        this.price = price;
    }
    
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getSocket() {
        return socket;
    }

    public int getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "mobo{" + "make=" + make + ", model=" + model + ", socket=" + socket + ", price=" + price + '}';
    }
        
}
