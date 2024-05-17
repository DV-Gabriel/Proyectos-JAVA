package Datacenter.Software;

import Archivos.manejoArchivos;

public class Procesamiento {
    private boolean nube;
    private boolean ia;
    private boolean analisis;
    private boolean virt;
    private boolean app;

    public Procesamiento() {
    }

    public Procesamiento(boolean nube, boolean ia, boolean analisis, boolean virt, boolean app) {
        this.nube = nube;
        this.ia = ia;
        this.analisis = analisis;
        this.virt = virt;
        this.app = app;
    }

    public boolean isNube() {
        return nube;
    }

    public void setNube(boolean nube) {
        if (this.nube != nube) {
            System.out.println("El valor de Nube se cambió a: " + nube);
        }
        this.nube = nube;
    }

    public boolean isIa() {
        return ia;
    }

    public void setIa(boolean ia) {
        if (this.ia != ia) {
            System.out.println("El valor de IA se cambió a: " + ia);
        }
        this.ia = ia;
    }

    public boolean isAnalisis() {
        return analisis;
    }

    public void setAnalisis(boolean analisis) {
        if (this.analisis != analisis) {
            System.out.println("El valor de Analisis se cambió a: " + analisis);
        }
        this.analisis = analisis;
    }

    public boolean isVirt() {
        return virt;
    }

    public void setVirt(boolean virt) {
        if (this.virt != virt) {
            System.out.println("El valor de virtualización se cambió a: " + virt);
        }
        this.virt = virt;
    }

    public boolean isApp() {
        return app;
    }

    public void setApp(boolean app) {
        if (this.app != app) {
            System.out.println("El valor de APP se cambió a: " + app);
        }
        this.app = app;
    }

    public void guardarEnArchivo(manejoArchivos archivoManager) {
        StringBuilder acciones = new StringBuilder();

        if (nube){
            acciones.append("Precesamiento en la nube \n");
        }
        if (ia){
            acciones.append("Procesamiento por IA \n");
        }
        if (analisis){
            acciones.append("Procesamiento de analisis de datos \n");
        }
        if (virt){
            acciones.append("Virtualizacion \n");
        }
        if (app){
            acciones.append("Procesamiento de aplicaciones \n");
        }
        archivoManager.escribirArchivo("El usuario en Procesamiento seleccionó:\n" + acciones.toString());
    }
}
