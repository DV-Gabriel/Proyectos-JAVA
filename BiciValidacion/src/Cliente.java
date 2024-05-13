public class Cliente {
    public static final int a = 1;
    private final String nombre;
    private final String tipoPago;
    private final int noCompras;

    public Cliente(String nombre,String tipoPago, int noCompras){
        //this.noCompras = noCompras;
        this.nombre = nombre;
        this.tipoPago = tipoPago;
        this.noCompras = a;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getTipoPago(){
        return this.tipoPago;
    }

    public String imprimirCliente(){

        return String.format("El cliente %s compro %d bici con %s", this.nombre,this.noCompras,this.tipoPago);
    }
}
