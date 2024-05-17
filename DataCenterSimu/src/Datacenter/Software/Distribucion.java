package Datacenter.Software;

import Archivos.manejoArchivos;

public class Distribucion {
    private boolean replicacion;
    private boolean almacenamientoDis;
    private boolean balanceo;
    private boolean almacenamientoCach;
    private boolean part;
    private boolean virt;

    public Distribucion() {
    }

    public Distribucion(boolean replicacion, boolean almacenamientoDis, boolean balanceo, boolean almacenamientoCach, boolean part, boolean virt) {
        this.replicacion = replicacion;
        this.almacenamientoDis = almacenamientoDis;
        this.balanceo = balanceo;
        this.almacenamientoCach = almacenamientoCach;
        this.part = part;
        this.virt = virt;
    }

    public boolean isReplicacion() {
        return replicacion;
    }

    public void setReplicacion(boolean replicacion) {
        if (this.replicacion != replicacion) {
            System.out.println("El valor de replicación se cambió a: " + replicacion);
        }
        this.replicacion = replicacion;
    }

    public boolean isAlmacenamientoDis() {
        return almacenamientoDis;
    }

    public void setAlmacenamientoDis(boolean almacenamientoDis) {
        if (this.almacenamientoDis != almacenamientoDis) {
            System.out.println("El valor de AlmacenamientoDis se cambió a: " + almacenamientoDis);
        }
        this.almacenamientoDis = almacenamientoDis;
    }

    public boolean isBalanceo() {
        return balanceo;
    }

    public void setBalanceo(boolean balanceo) {
        if (this.balanceo != balanceo) {
            System.out.println("El valor de balanceo se cambió a: " + balanceo);
        }
        this.balanceo = balanceo;
    }

    public boolean isAlmacenamientoCach() {
        return almacenamientoCach;
    }

    public void setAlmacenamientoCach(boolean almacenamientoCach) {
        if (this.almacenamientoCach != almacenamientoCach) {
            System.out.println("El valor de AlmacenamientoCach se cambió a: " + almacenamientoCach);
        }
        this.almacenamientoCach = almacenamientoCach;
    }

    public boolean isPart() {
        return part;
    }

    public void setPart(boolean part) {
        if (this.part != part) {
            System.out.println("El valor de Partimiento se cambió a: " + part);
        }
        this.part = part;
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
    public void guardarEnArchivo(manejoArchivos archivoManager) {
        StringBuilder acciones = new StringBuilder();

        if (replicacion) {
            acciones.append("Replicacion de datos\n");
        }

        if (balanceo) {
            acciones.append("Balanceo de carga\n");
        }

        if (part) {
            acciones.append("Particionamiento de datos\n");
        }

        if (virt) {
            acciones.append("Virtualización de recursos\n");
        }

        if (almacenamientoCach){
            acciones.append("Almacenamiento en caché\n");
        }
        if (almacenamientoDis){
            acciones.append("Almacenamiento distribuido\n");
        }
        archivoManager.escribirArchivo("El usuario en Distribución seleccionó:\n" + acciones.toString());
    }
}
