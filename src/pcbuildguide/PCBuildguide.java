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
public class PCBuildguide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    cpu rz3 = new cpu("AMD", "Ryzen 3 1200", 3.1, 3.4, 4, 4, 65, "AM4", 100);
    cpu rz5 = new cpu("AMD", "Ryzen 5 1600", 3.2, 3.6, 6, 12, 65, "AM4", 180);
    cpu rz7 = new cpu("AMD", "Ryzen 7 1700", 3, 3.7, 8, 16, 65, "AM4", 260);
    cpu thrdrp = new cpu("AMD", "Ryzen Threadripper", 3.4, 4.0, 16, 32, 180, "sTR4", 950);
    cpu i3 = new cpu("Intel", "i3-8100", 3.6, 0 ,4, 4, 65, "LGA1511", 117);
    cpu i5 = new cpu("Intel", "i5-8600K", 3.6, 4.3, 6, 6, 95, "LGA1511", 258);
    cpu i7 = new cpu("Intel", "i7-8700K", 3.7, 4.7, 6, 12, 95, "LGA1511", 350);
    cpu i9 = new cpu("Intel", "i9-7900X", 3.3, 4.3, 10, 20, 140, "LGA2066", 1000);
    
    gpu RadeonRx480 = new gpu("AMD", "", "", 0.0, 0.0, "", 1);
    gpu GeForceGTX180ti = new gpu("Nvidia", "", "", 0.0, 0.0, "", 1);
    gpu GeForceGTX1502g = new gpu("", "", "", 0.0, 0.0, "", 1);
    gpu GeForceGTX1070Gaming = new gpu("", "", "", 0.0, 0.0, "", 1);
    gpu GeForceGTX1080mini = new gpu("", "", "", 0.0, 0.0, "", 1);
    gpu RadeonRxVega56 = new gpu("AMD", "", "", 0.0, 0.0, "", 1);
    gpu GeForceGTX1060 = new gpu("", "", "", 0.0, 0.0, "", 1);
    gpu RadeonRx580GTS = new gpu("", "", "", 0.0, 0.0, "", 1);
    
}
