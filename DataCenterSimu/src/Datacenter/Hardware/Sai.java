package Datacenter.Hardware;

import Archivos.manejoArchivos;

public class    Sai {
    private boolean filtros;
    private boolean ventiladores;
    private boolean transformador;
    private boolean volt;
    private boolean corriente;
    private boolean prueba;


    public Sai() {
    }

    public Sai(boolean filtros, boolean ventiladores, boolean transformador, boolean volt, boolean corriente, boolean prueba) {
        this.filtros = filtros;
        this.ventiladores = ventiladores;
        this.transformador = transformador;
        this.volt = volt;
        this.corriente = corriente;
        this.prueba = prueba;
    }

    public void setFiltros(boolean filtros){
        if (this.filtros != filtros){
            System.out.println("El funcionamiento de los filtros cambió a " + filtros);
        }
        this.filtros = filtros;
    }
    public boolean isVolt(){
        return volt;
    }
    public void setVolt(boolean volt){
        if(this.volt != volt){
            System.out.println("El estado del voltaje cambió a " + volt);
        }
        this.volt = volt;
    }
    public boolean isCorriente(){
        return corriente;
    }
    public void setCorriente(boolean corriente){
        if(this.corriente != corriente){
            System.out.println("El estado de la corriente cambió a " + corriente);
        }
        this.corriente = corriente;
    }

    public boolean isTransformador() {
        return transformador;
    }
    public void setTransformador(boolean transformador){
        if(this.transformador != transformador){
            System.out.println("El funcionamiento del transformador cambió a " + transformador);
        }
        this.transformador = transformador;
    }

    public boolean isPrueba() {
        return prueba;
    }
    public void setPrueba(boolean prueba){
        if(this.prueba != prueba){
            System.out.println("El estado de la prueba de descarga pasó a " + prueba);
        }
        this.prueba = prueba;
    }

    public boolean isVentiladores() {
        return ventiladores;
    }
    public void setVentiladores(boolean ventiladores){
        if(this.ventiladores != ventiladores){
            System.out.println("El funcionamiento de los ventiladores cambió a " + ventiladores);
        }
        this.ventiladores = ventiladores;
    }
    public void guardarEnArchivo(manejoArchivos archivoManager){
        StringBuilder acciones = new StringBuilder();
        if (filtros){
            acciones.append("Filtros.\n");
        }
        if (ventiladores){
            acciones.append("Ventiladores.\n");
        }
        if (transformador){
            acciones.append("Transformador.\n");
        }
        if (volt){
            acciones.append("Voltaje.\n");
        }
        if (corriente){
            acciones.append("Corriente.\n");
        }
        if (prueba){
            acciones.append("Prueba de descarga.\n");
        }
        archivoManager.escribirArchivo("El usuario verificó el funcionamiento de: \n"+acciones.toString());
    }
}