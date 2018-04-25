
package pcbuildguide;

/**
 *
 * @author geoffreysalfi
 */
public class cases {
    
    private String color;
    private String make;
    private String model;
    private int price;

    public cases(String color, String make, String model, int price) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
    
    

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "cases{" + "color=" + color + ", make=" + make + ", model=" + model + ", price=" + price + '}';
    }
    
    
}
