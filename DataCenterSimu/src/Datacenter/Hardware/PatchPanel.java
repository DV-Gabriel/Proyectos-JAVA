package Datacenter.Hardware;
import Archivos.manejoArchivos;
public class PatchPanel {
    private boolean rj45;
    private boolean mtrj;
    private boolean fibraOptica;
    private boolean cat5;

    public PatchPanel() {
    }

    public PatchPanel(boolean rj45, boolean mtrj, boolean fibraOptica, boolean cat5) {
        this.rj45 = rj45;
        this.mtrj = mtrj;
        this.fibraOptica = fibraOptica;
        this.cat5 = cat5;
    }

    public void setRj45(boolean rj45) {
        if (this.rj45 != rj45) {
            System.out.println("El usuario ha desconectado el cable RJ45");
        }
        this.rj45 = rj45;
    }

    public boolean isRj45() {
        return rj45;
    }

    public boolean isMtrj() {
        return mtrj;
    }

    public void setMtrj(boolean mtrj) {
        if (this.mtrj != mtrj) {
            System.out.println("El usuario ha desconectado el cable MTRJ");
        }
        this.mtrj = mtrj;
    }

    public boolean isFibraOptica() {
        return fibraOptica;
    }

    public void setFibraOptica(boolean fibraOptica) {
        if (this.fibraOptica != fibraOptica) {
            System.out.println("El usuario ha desconectado la fibra optica");
        }
        this.fibraOptica = fibraOptica;
    }

    public boolean isCat5() {
        return cat5;
    }

    public void setCat5(boolean cat5) {
        if (this.cat5 != cat5) {
            System.out.println("El usuario ha desconectado el cable cat5");
        }
        this.cat5 = cat5;
    }

    public void guardarEnArchivo(manejoArchivos archivoManager) {
        StringBuilder acciones = new StringBuilder();

        if (rj45) {
            acciones.append("RJ45 \n");
        }
        if(mtrj){
            acciones.append("MTRJ \n");
        }
        if(fibraOptica){
            acciones.append("Fibra optica \n");
        }
        if(cat5){
            acciones.append("Cat5 \n");
        }
        archivoManager.escribirArchivo("El usuario ha desconectado los siguiente cables \n" +acciones.toString());
    }
}
