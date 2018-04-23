
package pcbuildguide;

import java.util.Scanner;

/**
 *
 * @author nicholasroberto
 */
public class PCBuildguide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String budget, FPS, resol, color, FF, GP, lighting;
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Welcome to the personal Computer Builder!");
        System.out.println("We will ask a few questions about specific computer components and based off your inputs, we will put together your ideal computer.");
        
        System.out.println("What is your desired budget? (low (500-1000), medium(1000,1500), high(1500 and up))");
        budget = scnr.nextLine();
        
        System.out.println("What FPS are you looking for?");
        FPS = scnr.nextLine();
        
        System.out.println("What resolution do you want?");
        resol = scnr.nextLine();
        
        System.out.println("Do you have a desired color for your machine?");
        color = scnr.nextLine();
        
        System.out.println("What is your desired form factor?");
        FF = scnr.nextLine();
        
        System.out.println("Would you like a glass panel? (Y/N)");
        GP = scnr.nextLine();
        
        System.out.println("Would you like interior lighting? (Y/N)");
        lighting = scnr.nextLine();
        
        
        
        
        System.out.println("Based off what you inputed, the recommended PC for you is: ");
    }
    
    cpu rz3 = new cpu("AMD", "Ryzen 3 1200", 3.1, 3.4, 4, 4, 65, "AM4", 100);
    cpu rz5 = new cpu("AMD", "Ryzen 5 1600", 3.2, 3.6, 6, 12, 65, "AM4", 180);
    cpu rz7 = new cpu("AMD", "Ryzen 7 1700", 3, 3.7, 8, 16, 65, "AM4", 260);
    cpu thrdrp = new cpu("AMD", "Ryzen Threadripper", 3.4, 4.0, 16, 32, 180, "sTR4", 950);
    cpu i3 = new cpu("Intel", "i3-8100", 3.6, 0 ,4, 4, 65, "LGA1511", 117);
    cpu i5 = new cpu("Intel", "i5-8600K", 3.6, 4.3, 6, 6, 95, "LGA1511", 258);
    cpu i7 = new cpu("Intel", "i7-8700K", 3.7, 4.7, 6, 12, 95, "LGA1511", 350);
    cpu i9 = new cpu("Intel", "i9-7900X", 3.3, 4.3, 10, 20, 140, "LGA2066", 1000);
    
    gpu RadeonRx460 = new gpu("AMD", "Gigabyte", "RX 460", 1212, 7000, "4GB GDDR5", 350, false, 130);
    gpu RadeonRx570 = new gpu("AMD", "MSI", "RX 570 Gaming X 4G", 1293, 7100, "4GB GDDR5", 450, false, 230);
    gpu RadeonRx580 = new gpu("AMD", "MSI", "RX 580 ARMOR MK2 8G", 1380, 8000, "8GB GDDR5", 500, false, 340);
    gpu RadeonRxVega64 = new gpu("AMD", "Sapphire", "Nitro+ RX Vega 64", 1423, 945, "8GB HBM2", 800, true, 700);
    gpu GeForceGTX1050ti = new gpu("NVIDIA", "EVGA", "GTX 1050 Ti Gaming", 1290, 7008, "4GB GDDR5", 300, false, 170);
    gpu GeForceGTX1060 = new gpu("NVIDIA", "ZOTAC", "GTX 1060 AMP!", 1556, 8000, "6GB GDDR5", 400, false, 285);
    gpu GeForceGTX1070 = new gpu("NVIDIA", "MSI", "GTX 1070 Gaming X 8G", 1607, 8108, "8GB GDDR5", 500, true, 400);
    gpu GeForceGTX1080ti = new gpu("NVIDIA", "EVGA", "GTX 1080 Ti FTW3 Gaming", 1569, 11016, "11GB GDDR5X", 600, true, 900);
    
    //String vendor, String model, String formfactor, String involtage, int wattage, int price
    powersupply Evga400W = new powersupply("Evga", "N1", "ATX", "100-240 VAC", 400, 35); //https://www.newegg.com/Product/Product.aspx?Item=9SIA6ZP3R86689
    powersupply Evga600W = new powersupply("Evga", "B1", "ATX", "100-240 VAC", 600, 52); //https://www.newegg.com/Product/Product.aspx?Item=1B4-012V-00014 
    powersupply Evga850W = new powersupply("Evga", "G3", "ATX", "100-240 VAC", 850, 170); //https://www.newegg.com/Product/Product.aspx?Item=9SIA6ZP56T4030
    powersupply Evga1000W = new powersupply("Evga", "PQ", "ATX", "100-240 VAC", 1000, 209); //https://www.newegg.com/Product/Product.aspx?Item=N82E16817438137
    
    //String vendor, String model, String platform, double frequency, boolean rgb, double voltage, int price
    ram a = new ram("", "", "", 0.0, true, 0.0, 1); 
    ram b = new ram("", "", "", 0.0, true, 0.0, 1); 
    ram c = new ram("", "", "", 0.0, true, 0.0, 1);
    ram d = new ram("", "", "", 0.0, true, 0.0, 1);
    
    //String vendor, String model, double storage, String connectiontype, int price
    storage aaa = new storage("", "", 0.0, "", 1);
    storage bbb = new storage("", "", 0.0, "", 1);
    storage ccc = new storage("", "", 0.0, "", 1);
    storage ddd = new storage("", "", 0.0, "", 1);
}
