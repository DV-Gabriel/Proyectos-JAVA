package Controlador.ControladoresSoft;

import Archivos.manejoArchivos;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import Datacenter.Software.Almacenamiento;

public class AlmacenamientoController {
    private manejoArchivos archivoManager = manejoArchivos.getInstance();
    @FXML
    private CheckBox hdds;

    @FXML
    private CheckBox ssds;

    @FXML
    private CheckBox capacidad6000TB;

    @FXML
    private CheckBox capacidad8000TB;

    @FXML
    private void guardarEnArchivo() {
        Almacenamiento almacenamiento = new Almacenamiento();

        almacenamiento.setHhds(hdds.isSelected());
        almacenamiento.setSsds(ssds.isSelected());
        almacenamiento.setTb6000(capacidad6000TB.isSelected());
        almacenamiento.setTb8000(capacidad8000TB.isSelected());

        almacenamiento.guardarEnArchivo(archivoManager);

    }
}
