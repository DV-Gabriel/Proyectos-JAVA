package Controlador.ControladoresSoft;

import Archivos.manejoArchivos;
import Datacenter.Software.Gestion;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class GestionController {
    private manejoArchivos archivoManager = manejoArchivos.getInstance();


    @FXML
    private CheckBox recursos;
    @FXML
    private CheckBox energia;
    @FXML
    private CheckBox seguridadFis;
    @FXML
    private CheckBox seguridadInfo;
    @FXML
    private CheckBox capacidad;

    @FXML
    public void guardarArchivo(){
        Gestion gestion = new Gestion();

        gestion.setTi(recursos.isSelected());
        gestion.setEnergia(energia.isSelected());
        gestion.setFis(seguridadFis.isSelected());
        gestion.setInfo(seguridadInfo.isSelected());
        gestion.setCapacidad(capacidad.isSelected());

        gestion.guardarEnArchivo(archivoManager);
    }
}
