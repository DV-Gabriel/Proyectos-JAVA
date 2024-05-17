    package Controlador;

    import Datacenter.Usuarios;
    import Datacenter.ValidacionUsuario;
    import javafx.fxml.FXML;
    import javafx.fxml.FXMLLoader;
    import javafx.fxml.Initializable;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.scene.control.Alert;
    import javafx.scene.control.Button;
    import javafx.stage.Stage;
    import javafx.event.ActionEvent;
    import java.io.IOException;
    import java.net.URL;
    import java.util.ResourceBundle;

    public class ServiciosController implements Initializable {
        @FXML
        private Button ejecutar1;
        @FXML
        private Button ejecutar2;
        @FXML
        private Button salir;

        private Usuarios.NivelAcceso nivelAcceso;

        public void setNivelAcceso(Usuarios.NivelAcceso nivelAcceso) {
            this.nivelAcceso = nivelAcceso;
            ejecutar1.setDisable(nivelAcceso != Usuarios.NivelAcceso.ADMIN && nivelAcceso != Usuarios.NivelAcceso.USUARIOSOFT);
            ejecutar2.setDisable(nivelAcceso != Usuarios.NivelAcceso.ADMIN && nivelAcceso != Usuarios.NivelAcceso.USUARIOHARD);
        }

        @FXML
        void actionEjecutarSotfware() throws IOException {
            if (nivelAcceso == Usuarios.NivelAcceso.ADMIN || nivelAcceso == Usuarios.NivelAcceso.USUARIOSOFT) {
                interfazSoftware();
            }
        }
        @FXML
        void actionEjecutarHardware() throws IOException {
            if (nivelAcceso == Usuarios.NivelAcceso.ADMIN || nivelAcceso == Usuarios.NivelAcceso.USUARIOHARD){
                interfazHardware();
            }
        }

        public void interfazSoftware() throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Software.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Interfaz de Software");
            stage.show();
        }
        public void interfazHardware() throws IOException{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Hardware.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Interfaz de Hardware");
            stage.show();
        }

        @FXML
        void actionSalir(ActionEvent event) {
            Stage stage = (Stage) salir.getScene().getWindow();
            stage.close();
        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
        }
    }


