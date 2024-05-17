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
    import javafx.scene.control.PasswordField;
    import javafx.scene.control.TextField;
    import javafx.stage.Stage;
    import javafx.event.ActionEvent;
    import java.io.IOException;
    import java.net.URL;
    import java.util.ResourceBundle;

    public class LoginController implements Initializable {

        @FXML
        private TextField usuario;

        @FXML
        private PasswordField contrasena;
        private Stage stage;

        public void setStage (Stage stage) {
            this.stage = stage;
        }
        @FXML
         void actionLogin(ActionEvent event) throws IOException {
            String user = usuario.getText();
            String password = contrasena.getText();

            if (ValidacionUsuario.validarUsuario(user, password)) {
                interfazServicios();
            } else {
                mostrarAlerta("Nombre de usuario o contraseña incorrectos.", Alert.AlertType.ERROR);
            }
        }

        private void mostrarAlerta(String mensaje, Alert.AlertType tipo) {
            Alert alerta = new Alert(tipo);
            alerta.setTitle("Mensaje");
            alerta.setContentText(mensaje);
            alerta.showAndWait();
        }

        private void interfazServicios() throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Servicios.fxml"));
            Parent root = loader.load();

            ServiciosController controller = loader.getController();
            Usuarios.NivelAcceso nivelAcceso = ValidacionUsuario.obtenerNivelAcceso(usuario.getText()); // Obtener el nivel de acceso del usuario
            controller.setNivelAcceso(nivelAcceso);

            Scene scene = new Scene(root);
            Stage currentStage = (Stage) usuario.getScene().getWindow();
            currentStage.setScene(scene);
            currentStage.show();
        }


        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }
    }
