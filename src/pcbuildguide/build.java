
package pcbuildguide;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author geoffreysalfi
 */
public class build {
    
    private cpu cpuFinal;
    private gpu gpuFinal;
    private powersupply psFinal;
    private ram ramFinal;
    private storage storageFinal;

    public build(cpu cpuFinal, gpu gpuFinal, powersupply psFinal, ram ramFinal, storage storageFinal) {
        this.cpuFinal = cpuFinal;
        this.gpuFinal = gpuFinal;
        this.psFinal = psFinal;
        this.ramFinal = ramFinal;
        this.storageFinal = storageFinal;
        
        
    
    }
    
    Random rand = new Random();
    
    
    //build build1 = new build(rz3, RadeonRx460, Evga400W, ripjawsv, ssd120);
    
    
}
