package Controlador.ControladoresHard;


import Archivos.manejoArchivos;
import Datacenter.Hardware.Enfriamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.rmi.registry.Registry;

public class EnfriamientoController {
    private manejoArchivos archivoManager = manejoArchivos.getInstance();
    @FXML
    private Button btnVerCambios;

    @FXML
    private CheckBox checkEstado;

    @FXML
    private CheckBox checkPotencia;

    @FXML
    private CheckBox checkRejillas;


    @FXML
    private void guardarEnArchivo(){
        Enfriamento enfriamiento = new Enfriamento();
        enfriamiento.setEstado(checkEstado.isSelected());
        enfriamiento.setVerPotencia(checkPotencia.isSelected());
        enfriamiento.setVerRejillas(checkRejillas.isSelected());

        enfriamiento.guardarEnArchivo(archivoManager);
    }
}