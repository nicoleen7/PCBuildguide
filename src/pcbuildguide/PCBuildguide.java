
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
        //show the components tha are in the PC
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
    
    powersupply Evga400W = new powersupply("EVGA", 400, 33);
    powersupply Evga600W = new powersupply("EVGA", 600, 53); 
    powersupply Evga850W = new powersupply("EVGA SuperNOVA", 850, 170);
    powersupply Evga1000W = new powersupply("EVGA superNOVA 1000", 1000, 210);
    
    //String vendor, String model, String platform, int frequency, boolean rgb, double voltage, int channels, int price
    ram ripjawsv = new ram("G.Skill", "Ripjaws V", "DDR4", 8, 2400, false, 1.2, 2, 92); 
    ram gammix = new ram("ADATA", "XPG Gammix", "DDR4", 16, 2666, false, 1.2, 2, 158); 
    ram vengance = new ram("Corsair", "Vengance", "DDR4", 16, 3200, true, 1.35, 2, 210);
    ram tridentz = new ram("G.Skill", "TridentZ", "DDR4", 32, 3000, true, 1.35, 4, 375);
    
    //String vendor, String model, int storage, String type, price
    storage ssd120 = new storage("ADATA", "Ultimate", 120, "SSD", 37);
    storage ssd480 = new storage("Samsung", "860 EVO", 500, "SSD", 145);
    storage ssd1000 = new storage("Team Group", "L5 Lite", 1000, "SSD", 220);
    storage hdd1000 = new storage("Seagate", "Barracuda", 1000, "HDD", 45);
    storage hdd2000 = new storage("WD", "Blue", 1000, "HDD", 60);
}
