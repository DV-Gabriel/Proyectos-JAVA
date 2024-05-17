package Datacenter.Software;

import Archivos.manejoArchivos;
public class Almacenamiento {


    private boolean hhds;
    private boolean ssds;
    private boolean tb6000;
    private boolean tb8000;


    public Almacenamiento() {
    }

    public Almacenamiento(boolean hhds, boolean ssds, boolean tb6000, boolean tb8000) {
        this.hhds = hhds;
        this.ssds = ssds;
        this.tb6000 = tb6000;
        this.tb8000 = tb8000;
    }


    public void setHhds(boolean hhds) {
        if (this.hhds != hhds) {
            System.out.println("El valor de hhds se cambió a: " + hhds);
        }
        this.hhds = hhds;
    }

    public boolean isSsds() {
        return ssds;
    }

    public void setSsds(boolean ssds) {
        if (this.ssds != ssds) {
            System.out.println("El valor de ssds se cambió a: " + ssds);
        }
        this.ssds = ssds;
    }

    public boolean isTb6000() {
        return tb6000;
    }

    public void setTb6000(boolean tb6000) {
        if (this.tb6000 != tb6000) {
            System.out.println("El valor de tb6000 se cambió a: " + tb6000);
        }
        this.tb6000 = tb6000;
    }

    public boolean isTb8000() {
        return tb8000;
    }

    public void setTb8000(boolean tb8000) {
        if (this.tb8000 != tb8000) {
            System.out.println("El valor de tb8000 se cambió a: " + tb8000);
        }
                    this.tb8000 = tb8000;
    }

    public void guardarEnArchivo(manejoArchivos archivoManager) {
        StringBuilder acciones = new StringBuilder();

        if (hhds) {
            acciones.append("HDDs.\n");
        }

        if (ssds) {
            acciones.append("SSDs .\n");
        }

        if (tb6000) {
            acciones.append("Capacidad de 6000TB .\n");
        }

        if (tb8000) {
            acciones.append("Capacidad de 8000TB .\n");
        }
            archivoManager.escribirArchivo("El usuario en Almacenamiento seleccionó:\n" + acciones.toString());
    }
}
