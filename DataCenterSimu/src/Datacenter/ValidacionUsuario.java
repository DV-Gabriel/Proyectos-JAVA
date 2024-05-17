    package Datacenter;
import java.util.List;
import java.util.ArrayList;

    /**
     * Clase <code>ValidacionUsuario</code>
     *
     *Clase que permite la validacion de el usuario y la contraseña
     *
     * @author Gabriel Del Valle, Josue Aldaz, Willy Mosquera, Gabriel Maldonado
     * @version 1.0
     * @since 2023
     * @see "Manual de usuario"
     */
public class ValidacionUsuario {
        /**
         * Lista de usuarios
         *Campo de tipo <code>ArrayList</code>
         */
    private static List<Usuarios> usuarios = new ArrayList<>();

        /**
         * Valor estatico que define los usuarios con sus respectivas contraseñas.
         */
    static {
        usuarios.add(new Usuarios("Gabriel", "1234", Usuarios.NivelAcceso.ADMIN));
        usuarios.add(new Usuarios("Willy","5678",  Usuarios.NivelAcceso.USUARIOSOFT));
        usuarios.add(new Usuarios("Josue","1111", Usuarios.NivelAcceso.USUARIOHARD));
        usuarios.add(new Usuarios("Juan","2222", Usuarios.NivelAcceso.USUARIOSOFTN2));
        usuarios.add(new Usuarios("Sebas","3333", Usuarios.NivelAcceso.USUARIOHARDN2));
    }


    public static List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(List<Usuarios> usuarios) {
        ValidacionUsuario.usuarios = usuarios;
    }

        /**
         * Metodo que permite la validacion de los usuarios.
         * @param nombre (Usuario) para la <code>ValidacionUsuario</code>
         * @param contrasena para la <code>ValidacionUsuario</code>
         * @return
         */
    public static boolean validarUsuario        (String nombre, String contrasena) {
        for (Usuarios usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombre) && usuario.getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }

        /**
         * Metodo para asignar nivel de acceso de cada usuario
         * @param nombreUsuario para asignar el nivel de acceso en <code>ValidacionUsuario</code>
         * @return
         */
    public static Usuarios.NivelAcceso obtenerNivelAcceso(String nombreUsuario) {
        for (Usuarios usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return usuario.getNivelAcceso();
            }
        }
        return null;
    }

}

