
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

    @Override
    public String toString() {
        return "build{" + "cpuFinal=" + cpuFinal + ", gpuFinal=" + gpuFinal + ", psFinal=" + psFinal + ", ramFinal=" + ramFinal + ", storageFinal=" + storageFinal + '}';
    }
    
    
    
    
}
