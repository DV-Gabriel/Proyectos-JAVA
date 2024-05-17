package Controlador.ControladoresSoft;

import Archivos.manejoArchivos;
import Datacenter.Software.Procesamiento;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class ProcesamientoController {
    private manejoArchivos archivoManager = manejoArchivos.getInstance();

    @FXML
    private CheckBox nube;
    @FXML
    private CheckBox ia;
    @FXML
    private CheckBox analisis;
    @FXML
    private CheckBox virtualizacion;
    @FXML
    private CheckBox app;

    @FXML
    public void guardarArchivo(){
        Procesamiento procesamiento = new Procesamiento();

        procesamiento.setNube(nube.isSelected());
        procesamiento.setIa(ia.isSelected());
        procesamiento.setAnalisis(analisis.isSelected());
        procesamiento.setVirt(virtualizacion.isSelected());
        procesamiento.setApp(app.isSelected());

        procesamiento.guardarEnArchivo(archivoManager);
    }
}
