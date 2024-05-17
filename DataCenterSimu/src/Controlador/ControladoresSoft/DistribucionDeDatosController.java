package Controlador.ControladoresSoft;

import Archivos.manejoArchivos;
import Datacenter.Software.Almacenamiento;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import Datacenter.Software.Distribucion;

public class DistribucionDeDatosController {

    private manejoArchivos archivoManager = manejoArchivos.getInstance();
    @FXML
    private CheckBox replicacion;

    @FXML
    private CheckBox almacenamientoDis;

    @FXML
    private CheckBox balanceo;

    @FXML
    private CheckBox almacenamientoCach;

    @FXML
    private CheckBox particionamiento;

    @FXML
    private CheckBox virtualizacion;

    @FXML
    private void guardarEnArchivo() {

        Distribucion distribucion = new Distribucion();

        distribucion.setReplicacion(replicacion.isSelected());
        distribucion.setBalanceo(balanceo.isSelected());
        distribucion.setPart(particionamiento.isSelected());
        distribucion.setVirt(virtualizacion.isSelected());
        distribucion.setAlmacenamientoDis(almacenamientoDis.isSelected());
        distribucion.setAlmacenamientoCach(almacenamientoCach.isSelected());

        distribucion.guardarEnArchivo(archivoManager);
    }
}


