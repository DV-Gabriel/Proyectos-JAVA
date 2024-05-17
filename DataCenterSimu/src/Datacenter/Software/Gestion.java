package Datacenter.Software;

import Archivos.manejoArchivos;

public class Gestion {
    private boolean ti;
    private boolean energia;
    private boolean fis;
    private boolean info;
    private boolean capacidad;

    public Gestion() {
    }

    public Gestion(boolean ti, boolean energia, boolean fis, boolean info, boolean capacidad) {
        this.ti = ti;
        this.energia = energia;
        this.fis = fis;
        this.info = info;
        this.capacidad = capacidad;
    }

    public boolean isTi() {
        return ti;
    }

    public void setTi(boolean ti) {
        if (this.ti != ti) {
            System.out.println("El valor de Recursos TI se cambió a: " + ti);
        }
        this.ti = ti;
    }

    public boolean isEnergia() {
        return energia;
    }

    public void setEnergia(boolean energia) {
        if (this.energia != energia) {
            System.out.println("El valor de Gestion de energía se cambió a: " + energia);
        }
        this.energia = energia;
    }

    public boolean isFis() {
        return fis;
    }

    public void setFis(boolean fis) {
        if (this.fis != fis) {
            System.out.println("El valor de Gestion en Seguridad Física se cambió a: " + fis);
        }
        this.fis = fis;
    }

    public boolean isInfo() {
        return info;
    }

    public void setInfo(boolean info) {
        if (this.info != info) {
            System.out.println("El valor de Gestión en seguridad de Informacíon se cambió a: " + info);
        }
        this.info = info;
    }

    public boolean isCapacidad() {
        return capacidad;
    }

    public void setCapacidad(boolean capacidad) {
        if (this.capacidad != capacidad) {
            System.out.println("El valor de Capacidad se cambió a: " + capacidad);
        }
        this.capacidad = capacidad;
    }

    public void guardarEnArchivo(manejoArchivos archivoManager) {
        StringBuilder acciones = new StringBuilder();

        if (ti){
            acciones.append("Gestion de recursos de TI \n");
        }

        if (energia){
            acciones.append("Gestion de energía y refrigeracion \n");
        }

        if (fis){
            acciones.append("Gestion de seguridad física");
        }
        if (info){
            acciones.append("Gestion de seguridad de información \n");
        }
        if (capacidad){
            acciones.append("Gestion de capacidad \n");
        }
        archivoManager.escribirArchivo("El usuario en Gestión seleccionó:\n" + acciones.toString());
    }
}
