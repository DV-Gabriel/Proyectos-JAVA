package Datacenter.Hardware;

import Archivos.manejoArchivos;

public class    Rack {
    private boolean limpExterior;
    private boolean limpSuelo;
    private boolean limpInterior;

    public Rack() {
    }

    public Rack(boolean limpExterior, boolean limpSuelo, boolean limpInterior) {
        this.limpExterior = limpExterior;
        this.limpSuelo = limpSuelo;
        this.limpInterior = limpInterior;
    }

    public boolean isLimpExterior(){
        return limpExterior;
    }
    public void setLimpExterior(boolean limpExterior){
        if(this.limpExterior != limpExterior){
            System.out.println("La solicitud de la limpieza exterior cambió a" + limpExterior);
        }
        this.limpExterior = limpExterior;
    }
    public boolean isLimpSuelo(){
        return limpSuelo;
    }
    public void  setLimpSuelo(boolean limpSuelo){
        if(this.limpSuelo != limpSuelo){
            System.out.println("La solicitud de limpieza del suelo técnico cambió a " + limpSuelo);
        }
        this.limpSuelo = limpSuelo;
    }
    public boolean isLimpInterior(){
        return limpInterior;
    }
    public void setLimpInterior(boolean limpInterior){
        if(this.limpInterior != limpInterior){
            System.out.println("La solicitud de limpieza interior cambió a " + limpInterior);
        }
        this.limpInterior = limpInterior;
    }
    public void guardarEnArchivo(manejoArchivos archivoManager){
        StringBuilder acciones = new StringBuilder();
        if(limpInterior){
            acciones.append("Limpieza interior \n");
        }
        if (limpSuelo){
            acciones.append("Limpieza del suelo \n");
        }
        if(limpExterior){
            acciones.append("Limpieza exterior \n");
        }
        archivoManager.escribirArchivo("El usuario solicitó \n" + acciones.toString());
    }
}
