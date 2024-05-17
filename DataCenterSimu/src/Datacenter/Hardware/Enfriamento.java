package Datacenter.Hardware;

import Archivos.manejoArchivos;
import java.sql.SQLOutput;

public class Enfriamento {

    private boolean verRejillas;
    private boolean verPotencia;
    private boolean estado;

    public Enfriamento() {
    }

    public Enfriamento(boolean verRejillas, boolean verPotencia, boolean estado) {
        this.verRejillas = verRejillas;
        this.verPotencia = verPotencia;
        this.estado = estado;
    }
    public boolean isVerRejillas(){
        return verRejillas;
    }
    public void setVerRejillas(boolean verRejillas){
        if(this.verRejillas != verRejillas){
            System.out.println("El funcionamiento de las rejillas cambió a" + verRejillas);
        }
        this.verRejillas = verRejillas;
    }
    public boolean isVerPotencia(){
        return verPotencia;
    }
    public void setVerPotencia(boolean verPotencia){
        if(this.verPotencia != verPotencia){
            System.out.println("El correcto nivel de potencia cambió a " + verPotencia);
        }
        this.verPotencia = verPotencia;
    }
    public boolean isEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        if(this.estado != estado){
            System.out.println("El usuario ha apagado el sistema de ventilación");
        }
        this.estado = estado;
    }
    public void guardarEnArchivo(manejoArchivos archivoManager){
        StringBuilder acciones = new StringBuilder();
        if (verPotencia){
            acciones.append("Potencia\n");
        }
        if(verRejillas){
            acciones.append("Rejillas \n");
        }
        if (estado){
            acciones.append("Energia \n");
        }
        archivoManager.escribirArchivo("El usuario verificó el estado de \n" +acciones.toString());
    }
}
