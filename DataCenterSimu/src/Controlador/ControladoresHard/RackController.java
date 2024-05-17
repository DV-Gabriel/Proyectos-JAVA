package Controlador.ControladoresHard;

import  Datacenter.Hardware.Rack;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import Archivos.manejoArchivos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class RackController {

    private manejoArchivos archivoManager = manejoArchivos.getInstance();
    @FXML
    private CheckBox checkLimpiezaExt;

    @FXML
    private CheckBox checkLimpiezaInt;

    @FXML
    private CheckBox checkLimpiezaSuelo;

    @FXML
    private Button solicitudLimpieza;

    @FXML
    private void guardarEnArchivo() {
        Rack rack = new Rack();
        rack.setLimpExterior(checkLimpiezaExt.isSelected());
        rack.setLimpSuelo(checkLimpiezaSuelo.isSelected());
        rack.setLimpInterior(checkLimpiezaInt.isSelected());

        rack.guardarEnArchivo(archivoManager);
    }
}
