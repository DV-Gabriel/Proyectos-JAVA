public class Vendedor {
    private String nombre;
    private int cedula;
    private int edad;
    private int noVentas;

    public Vendedor(String nombre, int cedula, int edad, int noVentas){
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.noVentas = noVentas;
    }
    public String getNombre(){
        return this.nombre;
    }

    public int getCedula() {
        return this.cedula;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getNoVentas() {
        return this.noVentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNoVentas(int noVentas) {
        this.noVentas = noVentas;
    }

    public String imprimirVendedor(){
        return String.format("El vendedor %s con ci %d de edad %d ha vendido %d bicis", this.nombre,this.cedula,this.edad,
                this.noVentas );
    }
}