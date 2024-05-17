package Controlador.ControladoresHard;

import Datacenter.Hardware.Sai;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import Archivos.manejoArchivos;

public class SaiController {
    private manejoArchivos archivoManager = manejoArchivos.getInstance();
    @FXML
    private Button btnComprobar;

    @FXML
    private CheckBox checkAmortiguador;

    @FXML
    private CheckBox checkCorriente;

    @FXML
    private CheckBox checkFiltros;

    @FXML
    private CheckBox checkPrueba;

    @FXML
    private CheckBox checkVentilador;

    @FXML
    private CheckBox checkVoltaje;
    @FXML
    private void guardarEnArchivo() {
        Sai sai = new Sai();
        sai.setTransformador(checkAmortiguador.isSelected());
        sai.setCorriente(checkCorriente.isSelected());
        sai.setVentiladores(checkVentilador.isSelected());
        sai.setFiltros(checkFiltros.isSelected());
        sai.setPrueba(checkPrueba.isSelected());
        sai.setVolt(checkVoltaje.isSelected());

        sai.guardarEnArchivo(archivoManager);

    }

}