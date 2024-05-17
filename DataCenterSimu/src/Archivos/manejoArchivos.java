package Archivos;

import java.io.FileWriter;
import java.io.IOException;



public class manejoArchivos {
    private static manejoArchivos instance;
    private static final String registro = "registro.txt";
    private static FileWriter writer;
    private manejoArchivos(){
        try {
            writer = new FileWriter(registro,true);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static manejoArchivos getInstance() {
        if (instance == null) {
            instance = new manejoArchivos();
        }
        return instance;
    }
    public static void escribirArchivo(String contenido) {
        try {
            writer.write(contenido);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrarArchivo() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
