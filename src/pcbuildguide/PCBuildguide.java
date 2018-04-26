
package pcbuildguide;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nicholasroberto and geoffreysalfi
 */
public class PCBuildguide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mobo am4 = new mobo("Gigabyte", "AB350 Gaming 3", "AM4", 100);
        mobo lga1151 = new mobo("MSI", "Z370 Gaming Plus", "LGA1151", 110);
        mobo str4 = new mobo("ASUS", "Prime X399-A", "sTR4", 320);
        mobo lga2066 = new mobo("ASUS", "ROG Strix X299-E", "LGA2066", 320);
        
        cpu rz3 = new cpu("AMD", "Ryzen 3 1200", 3.1, 3.4, 4, 4, 65, "AM4", 100, am4, 1);
        cpu rz5 = new cpu("AMD", "Ryzen 5 1600", 3.2, 3.6, 6, 12, 65, "AM4", 180, am4, 3);
        cpu rz7 = new cpu("AMD", "Ryzen 7 1700", 3, 3.7, 8, 16, 65, "AM4", 260, am4, 5);
        cpu thrdrp = new cpu("AMD", "Ryzen Threadripper", 3.4, 4.0, 16, 32, 180, "sTR4", 950, str4, 7);
        cpu i3 = new cpu("Intel", "i3-8100", 3.6, 0 ,4, 4, 65, "LGA1151", 117, lga1151, 2);
        cpu i5 = new cpu("Intel", "i5-8600K", 3.6, 4.3, 6, 6, 95, "LGA1151", 258, lga1151, 4);
        cpu i7 = new cpu("Intel", "i7-8700K", 3.7, 4.7, 6, 12, 95, "LGA1151", 350, lga1151, 6);
        cpu i9 = new cpu("Intel", "i9-7900X", 3.3, 4.3, 10, 20, 140, "LGA2066", 1000, lga2066, 8);

        gpu RadeonRx460 = new gpu("AMD", "Gigabyte", "RX 460", 1212, 7000, "4GB GDDR5", 350, false, 130, 1);
        gpu RadeonRx570 = new gpu("AMD", "MSI", "RX 570 Gaming X 4G", 1293, 7100, "4GB GDDR5", 450, false, 230, 3);
        gpu RadeonRx580 = new gpu("AMD", "MSI", "RX 580 ARMOR MK2 8G", 1380, 8000, "8GB GDDR5", 500, false, 340, 5);
        gpu RadeonRxVega64 = new gpu("AMD", "Sapphire", "Nitro+ RX Vega 64", 1423, 945, "8GB HBM2", 800, true, 700, 7);
        gpu GeForceGTX1050ti = new gpu("NVIDIA", "EVGA", "GTX 1050 Ti Gaming", 1290, 7008, "4GB GDDR5", 300, false, 170, 2);
        gpu GeForceGTX1060 = new gpu("NVIDIA", "ZOTAC", "GTX 1060 AMP!", 1556, 8000, "6GB GDDR5", 400, false, 285, 4);
        gpu GeForceGTX1070 = new gpu("NVIDIA", "MSI", "GTX 1070 Gaming X 8G", 1607, 8108, "8GB GDDR5", 500, true, 400, 6);
        gpu GeForceGTX1080ti = new gpu("NVIDIA", "EVGA", "GTX 1080 Ti FTW3 Gaming", 1569, 11016, "11GB GDDR5X", 600, true, 900, 8);

        powersupply Evga400W = new powersupply("EVGA", 400, 33);
        powersupply Evga600W = new powersupply("EVGA", 600, 53); 
        powersupply Evga850W = new powersupply("EVGA SuperNOVA", 850, 170);
        powersupply Evga1000W = new powersupply("EVGA superNOVA 1000", 1000, 210);

        ram ripjawsv = new ram("G.Skill", "Ripjaws V", "DDR4", 8, 2400, false, 1.2, 2, 92, 1); 
        ram gammix = new ram("ADATA", "XPG Gammix", "DDR4", 16, 2666, false, 1.2, 2, 158, 2); 
        ram vengance = new ram("Corsair", "Vengance", "DDR4", 16, 3200, true, 1.35, 2, 210, 3);
        ram tridentz = new ram("G.Skill", "TridentZ", "DDR4", 32, 3000, true, 1.35, 4, 375, 4);

        //String vendor, String model, int storage, String type, price
        storage ssd120 = new storage("ADATA", "Ultimate", 120, "SSD", 37);
        storage ssd480 = new storage("Samsung", "860 EVO", 500, "SSD", 145);
        storage ssd1000 = new storage("Team Group", "L5 Lite", 1000, "SSD", 220);
        storage hdd1000 = new storage("Seagate", "Barracuda", 1000, "HDD", 45);
        storage hdd2000 = new storage("WD", "Blue", 1000, "HDD", 60);

        games Minecraft = new games("Minecraft","2009", 1);
        games GTA = new games("Grand Theft Auto 5", "2013", 2);
        games PubG = new games("PlayerUnknown Battlegrounds", "2017", 2);
        games Overwatch = new games("Overwatch","2016", 1);
        games Fortnite = new games("Fortnite", "2017", 1);
        games LoL = new games("League of Legends", "2009", 1);
        games RL = new games("Rocket League", "2015", 1);
        games FC5 = new games("Far Cry 5", "2018", 2);
        games CoD = new games("Call of Duty WW2", "2017", 2);
        games MLB = new games("MLB The Show '18", "2018", 2);

        cases white = new cases("White", "NZXT", "S340", 75);
        cases black = new cases("Black", "Thermaltake", "View 31", 105);
        cases red = new cases("Red", "Corsair", "Carbide SPEC-02", 60);
        cases blue = new cases("Blue", "DeepCool", "TX", 50);
        
        ArrayList<cpu> cpus = new ArrayList<>();

        cpus.add(rz3);
        cpus.add(rz5);
        cpus.add(rz7);
        cpus.add(thrdrp);
        cpus.add(i3);
        cpus.add(i5);
        cpus.add(i7);
        cpus.add(i9);

        ArrayList<gpu> gpus = new ArrayList<>();

        gpus.add(RadeonRx460);
        gpus.add(RadeonRx570);
        gpus.add(RadeonRx580);
        gpus.add(RadeonRxVega64);
        gpus.add(GeForceGTX1050ti);
        gpus.add(GeForceGTX1060);
        gpus.add(GeForceGTX1070);
        gpus.add(GeForceGTX1080ti);

        ArrayList<powersupply> psu = new ArrayList<>();

        psu.add(Evga400W);
        psu.add(Evga600W);
        psu.add(Evga850W);
        psu.add(Evga1000W);

        ArrayList<ram> rams = new ArrayList<>();

        rams.add(ripjawsv);
        rams.add(gammix);
        rams.add(vengance);
        rams.add(tridentz);

        ArrayList<storage> storages = new ArrayList<>();

        storages.add(ssd120);
        storages.add(ssd480);
        storages.add(ssd1000);
        storages.add(hdd1000);
        storages.add(hdd2000);

        ArrayList<games> game = new ArrayList<>();

        game.add(Minecraft);
        game.add(GTA);
        game.add(PubG);
        game.add(Overwatch);
        game.add(Fortnite);
        game.add(LoL);
        game.add(RL);
        game.add(FC5);
        game.add(CoD);
        game.add(MLB);
    
        
        String budget, game1, game2, game3, FPS, resol, color, lighting;
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Welcome to the personal Computer Builder!");
        System.out.println("We will ask a few questions about specific computer components and based off your inputs, we will put together your ideal computer.");
        
        System.out.println("What is your desired budget? (low (500-1000), medium(1000,1500), high(1500 and up))");
        budget = scnr.nextLine();
        
        System.out.println("Pick three games from this list of 10 and press enter after each one:");
        System.out.println(game.toString());
        game1 = scnr.nextLine();
        game2 = scnr.nextLine();
        game3 = scnr.nextLine();
        
        System.out.println("What FPS are you looking for?");
        FPS = scnr.nextLine();
                
        System.out.println("What resolution do you want? 1080p, 1440p, 2160p (4K)?");
        resol = scnr.nextLine();
        
        System.out.println("What is your desired color for your machine?");
        color = scnr.nextLine();
        
        System.out.println("Would you like interior lighting? (Y/N)");
        lighting = scnr.nextLine();
        
        System.out.println("Based off what you inputed, the recommended PC for you is: ");
        
        build yourbuild = new build();
        yourbuild.decide(budget, game1, game2, game3, FPS, resol, color, lighting);
        //show the components that are in the PC
    }
    
    
    
}
