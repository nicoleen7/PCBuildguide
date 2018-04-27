
package pcbuildguide;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author geoffreysalfi and nicholasroberto
 */
public class build {
    
    private cpu cpuFinal;
    private gpu gpuFinal;
    private powersupply psFinal;
    private ram ramFinal;
    private storage storageFinal;
    private cases caseFinal;

    public build(cpu cpuFinal, gpu gpuFinal, powersupply psFinal, ram ramFinal, storage storageFinal, cases caseFinal) {
        this.cpuFinal = null;
        this.gpuFinal = null;
        this.psFinal = null;
        this.ramFinal = null;
        this.storageFinal = null;
        this.caseFinal = null;
    } 

    public cpu getCpuFinal() {
        return cpuFinal;
    }

    public gpu getGpuFinal() {
        return gpuFinal;
    }

    public powersupply getPsFinal() {
        return psFinal;
    }

    public ram getRamFinal() {
        return ramFinal;
    }

    public storage getStorageFinal() {
        return storageFinal;
    }

    public cases getCaseFinal() {
        return caseFinal;
    }

    public void setCpuFinal(cpu cpuFinal) {
        this.cpuFinal = cpuFinal;
    }

    public void setGpuFinal(gpu gpuFinal) {
        this.gpuFinal = gpuFinal;
    }

    public void setPsFinal(powersupply psFinal) {
        this.psFinal = psFinal;
    }

    public void setRamFinal(ram ramFinal) {
        this.ramFinal = ramFinal;
    }

    public void setStorageFinal(storage storageFinal) {
        this.storageFinal = storageFinal;
    }

    public void setCaseFinal(cases caseFinal) {
        this.caseFinal = caseFinal;
    }
  
    public int finalprice(build build) {
        int i = build.caseFinal.getPrice() + build.cpuFinal.getPrice() + build.gpuFinal.getPrice() + build.psFinal.getPrice() + build.ramFinal.getPrice() + build.storageFinal.getPrice();
        return i;
    }
    
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
    
    public ArrayList cpus() {
        ArrayList<cpu> cpus = new ArrayList<>();

        cpus.add(rz3);
        cpus.add(i3);
        cpus.add(rz5);
        cpus.add(i5);
        cpus.add(rz7);
        cpus.add(i7);
        cpus.add(thrdrp);
        cpus.add(i9);
        
        return cpus;
    }
    
    gpu RadeonRx460 = new gpu("AMD", "Gigabyte", "RX 460", 1212, 7000, "4GB GDDR5", 350, false, 130, 1);
    gpu RadeonRx570 = new gpu("AMD", "MSI", "RX 570 Gaming X 4G", 1293, 7100, "4GB GDDR5", 450, false, 230, 3);
    gpu RadeonRx580 = new gpu("AMD", "MSI", "RX 580 ARMOR MK2 8G", 1380, 8000, "8GB GDDR5", 500, false, 340, 5);
    gpu RadeonRxVega64 = new gpu("AMD", "Sapphire", "Nitro+ RX Vega 64", 1423, 945, "8GB HBM2", 800, true, 700, 7);
    gpu GeForceGTX1050ti = new gpu("NVIDIA", "EVGA", "GTX 1050 Ti Gaming", 1290, 7008, "4GB GDDR5", 300, false, 170, 2);
    gpu GeForceGTX1060 = new gpu("NVIDIA", "ZOTAC", "GTX 1060 AMP!", 1556, 8000, "6GB GDDR5", 400, false, 285, 4);
    gpu GeForceGTX1070 = new gpu("NVIDIA", "MSI", "GTX 1070 Gaming X 8G", 1607, 8108, "8GB GDDR5", 500, true, 400, 6);
    gpu GeForceGTX1080ti = new gpu("NVIDIA", "EVGA", "GTX 1080 Ti FTW3 Gaming", 1569, 11016, "11GB GDDR5X", 600, true, 900, 8);
    
    public ArrayList gpus() {
        ArrayList<gpu> gpus = new ArrayList<>();

        gpus.add(RadeonRx460);
        gpus.add(GeForceGTX1050ti);
        gpus.add(RadeonRx570);
        gpus.add(GeForceGTX1060);
        gpus.add(RadeonRx580);
        gpus.add(GeForceGTX1070);
        gpus.add(RadeonRxVega64);       
        gpus.add(GeForceGTX1080ti);
        
        return gpus;
    }
    
    powersupply Evga400W = new powersupply("EVGA", 400, 33);
    powersupply Evga600W = new powersupply("EVGA", 600, 53); 
    powersupply Evga850W = new powersupply("EVGA SuperNOVA", 850, 170);
    powersupply Evga1000W = new powersupply("EVGA superNOVA 1000", 1000, 210);
    
    public ArrayList psu() {
        ArrayList<powersupply> psu = new ArrayList<>();

        psu.add(Evga400W);
        psu.add(Evga600W);
        psu.add(Evga850W);
        psu.add(Evga1000W);
        
        return psu;
    }
    
    ram ripjawsv = new ram("G.Skill", "Ripjaws V", "DDR4", 8, 2400, false, 1.2, 2, 92, 1); 
    ram gammix = new ram("ADATA", "XPG Gammix", "DDR4", 16, 2666, false, 1.2, 2, 158, 2); 
    ram vengance = new ram("Corsair", "Vengance", "DDR4", 16, 3200, true, 1.35, 2, 210, 3);
    ram tridentz = new ram("G.Skill", "TridentZ", "DDR4", 32, 3000, true, 1.35, 4, 375, 4);
    
    public ArrayList rams() {
        ArrayList<ram> rams = new ArrayList<>();

        rams.add(ripjawsv);
        rams.add(gammix);
        rams.add(vengance);
        rams.add(tridentz);
        
        return rams;
    }
    
    storage ssd120 = new storage("ADATA", "Ultimate", 120, "SSD", 37);
    storage ssd480 = new storage("Samsung", "860 EVO", 500, "SSD", 145);
    storage ssd1000 = new storage("Team Group", "L5 Lite", 1000, "SSD", 220);
    storage hdd1000 = new storage("Seagate", "Barracuda", 1000, "HDD", 45);
    storage hdd2000 = new storage("WD", "Blue", 1000, "HDD", 60);
    
    public ArrayList storages() {
        ArrayList<storage> storages = new ArrayList<>();

        storages.add(ssd120);
        storages.add(ssd480);
        storages.add(ssd1000);
        storages.add(hdd1000);
        storages.add(hdd2000);
        
        return storages;
    }
    
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
    
    public ArrayList game() {
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
        
        return game;
    }
    
    cases white = new cases("White", "NZXT", "S340", 75);
    cases black = new cases("Black", "Thermaltake", "View 31", 105);
    cases red = new cases("Red", "Corsair", "Carbide SPEC-02", 60);
    cases blue = new cases("Blue", "DeepCool", "TX", 50);
    
    //cpu cpuFinal, gpu gpuFinal, powersupply psFinal, ram ramFinal, storage storageFinal, cases caseFinal
    
    //1080p 60fps most games
    build lowwhite = new build(rz3, RadeonRx460, Evga400W, ripjawsv, hdd1000, white);
    build lowblack = new build(rz3, GeForceGTX1050ti, Evga400W, ripjawsv, hdd1000, black);
    build lowred = new build(i3, RadeonRx460, Evga400W, ripjawsv, hdd1000, red);
    build lowblue = new build(i3, GeForceGTX1050ti, Evga400W, ripjawsv, hdd1000, blue);
    
    //1080p 60fps all games
    build mediumlowwhite = new build(rz5, RadeonRx570, Evga600W, gammix, ssd480, white);
    build mediumlowblack = new build(i5, RadeonRx570, Evga600W, gammix, ssd480, black);
    build mediumlowred = new build(rz5, GeForceGTX1060, Evga600W, gammix, ssd480, red);
    build mediumlowblue = new build(i5, GeForceGTX1060, Evga600W, gammix, ssd480, blue);
    
    //1440p 60fps OR 1080p 144fps all games
    build mediumhighwhite = new build(rz5, RadeonRx580, Evga600W, vengance, ssd1000, white);
    build mediumhighblack = new build(rz5, GeForceGTX1070, Evga600W, vengance, ssd1000, black);
    build mediumhighred = new build(i5, GeForceGTX1070, Evga600W, vengance, ssd1000, red);
    build mediumhighblue = new build(i5, RadeonRx580, Evga600W, vengance, ssd1000, blue);
    
    //close to 4k 60fps or close to 1440p 144fps most games
    build highwhite = new build(rz7, GeForceGTX1070, Evga850W, vengance, ssd1000, white);
    build highblack = new build(i7, GeForceGTX1070, Evga850W, vengance, ssd1000, black);
    build highred = new build(rz7, GeForceGTX1070, Evga850W, vengance, ssd1000, red);
    build highblue = new build(i7, GeForceGTX1070, Evga850W, vengance, ssd1000, blue);
    
    //4k 60fps and 1440p 144fps all games
    build ultrawhite = new build(thrdrp, RadeonRxVega64, Evga1000W, tridentz, ssd1000, white);
    build ultrablack = new build(thrdrp, GeForceGTX1080ti, Evga1000W, tridentz, ssd1000, black);
    build ultrared = new build(i9, RadeonRxVega64, Evga1000W, tridentz, ssd1000, red);
    build ultrablue = new build(i9, GeForceGTX1080ti, Evga1000W, tridentz, ssd1000, blue);
    
    public build decide(String budget, int FPS, String resol, String color){
        if (budget.equalsIgnoreCase("low") && FPS <= 60 && resol.contains("1080")){
            if (color.equalsIgnoreCase("white")){
                return lowwhite;
            }
            else if (color.equalsIgnoreCase("black")){
                return lowblack;
            }
            else if (color.equalsIgnoreCase("red")){
                return lowred;
            }
            else if (color.equalsIgnoreCase("blue")){
                return lowblue;
            }
        }
        
        else if (budget.equalsIgnoreCase("medium") && FPS <= 60 && resol.contains("1440")){
            if (color.equalsIgnoreCase("white")){
                return mediumlowwhite;
            }
            else if (color.equalsIgnoreCase("black")){
                return mediumlowblack;
            }
            else if (color.equalsIgnoreCase("red")){
                return mediumlowred;
            }
            else if (color.equalsIgnoreCase("blue")){
                return mediumlowblue;
            }
        }
        
        else if ((budget.equalsIgnoreCase("medium") && FPS <= 60 && resol.contains("1440")) || (budget.equalsIgnoreCase("medium") && FPS > 60 && FPS <= 144 && resol.contains("1080"))){
            if (color.equalsIgnoreCase("white")){
                return mediumhighwhite;
            }
            else if (color.equalsIgnoreCase("black")){
                return mediumhighblack;
            }
            else if (color.equalsIgnoreCase("red")){
                return mediumhighred;
            }
            else if (color.equalsIgnoreCase("blue")){
                return mediumhighblue;
            }
        }
        
        else if ((budget.equalsIgnoreCase("high") && FPS < 60 && (resol.contains("4k") || resol.contains("2160"))) || (budget.equalsIgnoreCase("high") && FPS >= 60 && FPS <= 100 && resol.contains("1440"))){
            if (color.equalsIgnoreCase("white")){
                return highwhite;
            }
            else if (color.equalsIgnoreCase("black")){
                return highblack;
            }
            else if (color.equalsIgnoreCase("red")){
                return highred;
            }
            else if (color.equalsIgnoreCase("blue")){
                return highblue;
            }      
        }
        
        else if ((budget.equalsIgnoreCase("high") && FPS >= 60 && FPS <= 100 && (resol.contains("4k") || resol.contains("2160"))) || (budget.equalsIgnoreCase("high") && FPS > 60 && FPS <= 144 && resol.contains("1440"))){
            if (color.equalsIgnoreCase("white")){
                System.out.println("Your system can also be used as a high end workstation.");
                return ultrawhite;
            }
            else if (color.equalsIgnoreCase("black")){
                System.out.println("Your system can also be used as a high end workstation.");
                return ultrablack;
            }
            else if (color.equalsIgnoreCase("red")){
                System.out.println("Your system can also be used as a high end workstation.");
                return ultrared;
            }
            else if (color.equalsIgnoreCase("blue")){
                System.out.println("Your system can also be used as a high end workstation.");
                return ultrablue;
            } 
        }
        System.out.println("No such system exists, please change your budget or other parameters.");
        return null;
    }
    
//    public build decide(String budget, games game1, games game2, games game3, int FPS, String resol, String color, String lighting){
//        build finalbuild = new build();
//        if (FPS == 60 && resol.contains("1080")){
//            
//        if (game1.getRating() + game2.getRating() + game3.getRating() == 3) {
//            finalbuild.setGpuFinal(finalbuild.GeForceGTX1050ti);
//        }
//        
//        if (game1.getRating() + game2.getRating() + game3.getRating() > 3 || game1.getRating() + game2.getRating() + game3.getRating() < 6){
//            for (int i = 0; i < finalbuild.gpus().size();){
//                if (finalbuild.gpus().get(i) > )
//            }
//        }
//        }
//        
//        if (budget.equalsIgnoreCase("low")) {
//            //finalbuild.caseFinal.getPrice() + finalbuild.cpuFinal.getPrice() + finalbuild.gpuFinal.getPrice() + finalbuild.psFinal.getPrice() + finalbuild.ramFinal.getPrice() + finalbuild.storageFinal.getPrice() < 1000;
//        }
//        if (budget.equalsIgnoreCase("medium")) {
//            //finalbuild.caseFinal.getPrice() + finalbuild.cpuFinal.getPrice() + finalbuild.gpuFinal.getPrice() + finalbuild.psFinal.getPrice() + finalbuild.ramFinal.getPrice() + finalbuild.storageFinal.getPrice() < 1000;
//        }
//        
//        return finalbuild;
//    }

    
    
    
    //build build1 = new build(rz3, RadeonRx460, Evga400W, ripjawsv, ssd120);

    @Override
    public String toString() {
        return "build{" + "cpuFinal=" + cpuFinal + ", gpuFinal=" + gpuFinal + ", psFinal=" + psFinal + ", ramFinal=" + ramFinal + ", storageFinal=" + storageFinal + ", caseFinal=" + caseFinal + '}';
    }
    
    
}
