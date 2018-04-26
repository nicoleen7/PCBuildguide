
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

    public build() {
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

    public Random getRand() {
        return rand;
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

    public void setRand(Random rand) {
        this.rand = rand;
    }
    
    public build decide(String budget, String game1, String game2, String game3, String FPS, String resol, String color, String lighting){
        build finalbuild = new build();
        if (budget.equalsIgnoreCase("low")){
            //finalbuild.caseFinal.getPrice() + finalbuild.cpuFinal.getPrice() + finalbuild.gpuFinal.getPrice() + finalbuild.psFinal.getPrice() + finalbuild.ramFinal.getPrice() + finalbuild.storageFinal.getPrice() < 1000;
        }
        else if (budget.equalsIgnoreCase("medium")){
            //finalbuild.caseFinal.getPrice() + finalbuild.cpuFinal.getPrice() + finalbuild.gpuFinal.getPrice() + finalbuild.psFinal.getPrice() + finalbuild.ramFinal.getPrice() + finalbuild.storageFinal.getPrice() < 1000;
        }
        
        return finalbuild;
    }

    @Override
    public String toString() {
        return "build{" + "cpuFinal=" + cpuFinal + ", gpuFinal=" + gpuFinal + ", psFinal=" + psFinal + ", ramFinal=" + ramFinal + ", storageFinal=" + storageFinal + ", caseFinal=" + caseFinal + ", rand=" + rand + '}';
    }
        
    Random rand = new Random();
    
    
    //build build1 = new build(rz3, RadeonRx460, Evga400W, ripjawsv, ssd120);
    
    
}
