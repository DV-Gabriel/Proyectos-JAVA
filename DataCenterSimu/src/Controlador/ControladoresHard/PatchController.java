package Controlador.ControladoresHard;

import Archivos.manejoArchivos;
import Datacenter.Hardware.PatchPanel;
import Datacenter.Hardware.Sai;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class PatchController {
    private manejoArchivos archivoManager = manejoArchivos.getInstance();
    @FXML
    private CheckBox rj45;
    @FXML
    private CheckBox mtrj;
    @FXML
    private CheckBox fibra;
    @FXML
    private CheckBox cat5;

    @FXML
    private void guardarEnArchivo() {
        PatchPanel patchPanel = new PatchPanel();
        patchPanel.setRj45(rj45.isSelected());
        patchPanel.setMtrj(mtrj.isSelected());
        patchPanel.setFibraOptica(fibra.isSelected());
        patchPanel.setCat5(cat5.isSelected());

        patchPanel.guardarEnArchivo(archivoManager);

    }

}
