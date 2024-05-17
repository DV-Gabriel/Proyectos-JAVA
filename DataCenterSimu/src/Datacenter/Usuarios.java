package Datacenter;
/**
 * Clase <code>Usuarios</code>
 *
 *Crea el objeto usuario
 *
 * @author Gabriel Del Valle, Josue Aldaz, Willy Mosquera, Gabriel Maldonado
 * @version 1.0
 * @since 2023
 * @see "Manual de usuario"
 */
public class Usuarios {
    /**
     * Nombre del usuario
     * Campo de tipo <code>String</code>
     */
    private String nombreUsuario;
    /**
     * Contraseña del usuario
     * Campo de tipo <code>String</code>
     */
    private String contrasena;
    /**
     * Nivel de acceso del usuario
     * Campo de tipo <code>enum</code>
     */
     private NivelAcceso nivelAcceso;

    /**
     * Función que describe la creación del usurio
     * @param nombreUsuario nombre de los <code>Usuarios</code>
     * @param contrasena de los <code>Usuarios</code>
     * @param nivelAcceso  de los<code>Usuarios</code>
     */
    public Usuarios(String nombreUsuario, String contrasena, NivelAcceso nivelAcceso){
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.nivelAcceso = nivelAcceso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public NivelAcceso getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso( NivelAcceso nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public enum NivelAcceso {
        ADMIN,
        USUARIOSOFT,
        USUARIOHARD,
        USUARIOSOFTN2,
        USUARIOHARDN2
    }
}
