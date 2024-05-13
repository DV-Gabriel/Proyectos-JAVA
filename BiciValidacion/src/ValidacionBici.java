import java.util.Locale;
import java.util.Scanner;


public class ValidacionBici {
    private Bicicleta bicicleta;
    private Vendedor vendedor;
    private String fecha;
    private Cliente cliente;
    Scanner sc = new Scanner(System.in);
    public ValidacionBici(Vendedor vendedor, String fecha, Cliente cliente){
        this.bicicleta = null;
        this.vendedor = vendedor;
        this.fecha = fecha;
        this.cliente = cliente;

    }

    public Bicicleta getBicicleta() {
        return this.bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Vendedor getVendedor() {
        return this.vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void ValidacionBici1(){
        sc.useLocale(Locale.ENGLISH);
                do { this.bicicleta.getTipoLlanta();
                    System.out.println("Ingrese el tipo de llanta en minusculas: (puede ser bmx montaniera o ruta)");
                    String tipoLlanta = sc.nextLine();
                    this.bicicleta.setTipoLlanta(tipoLlanta);
                } while (this.bicicleta.getTipoLlanta() == "");


                do {this.bicicleta.getTipoCuadro();
                System.out.println("Ingrese el tipo de cuadro en micusculas: (puede ser acero, aluminio, fibra de carbono, titanio ");
                String tipoCuadro = sc.nextLine();
                    this.bicicleta.setTipoCuadro(tipoCuadro);
                }while (this.bicicleta.getTipoCuadro() == "");

            this.bicicleta.getColor();
            System.out.println("Ingrese el color:");
            String color = sc.next();
            sc.nextLine();
            this.bicicleta.setColor(color);

            this.bicicleta.getNumeroSerie();
            System.out.println("Ingrese el numero de serie: ");
            String numeroSerie = sc.nextLine();
            this.bicicleta.setNumeroSerie(numeroSerie);

        while (this.bicicleta.getMarchas() == 0){
            System.out.println("Ingrese el numero de marchas valido (6-24):");
            int marchas = sc.nextInt();
            sc.nextLine();
            this.bicicleta.setMarchas(marchas);
        }

       this.bicicleta.getTipoManubrio();
            System.out.println("Ingrese un tipo de manubrio: (puede ser recto, doble altura, ruta, bmx , mariposa)");
            String manubrio = sc.nextLine();
            sc.nextLine();
            this.bicicleta.setTipoManubrio(manubrio);

            this.bicicleta.getModelo();
        System.out.println("Ingrese el modelo: ");
        String modelo = sc.nextLine();
        this.bicicleta.setModelo(modelo);

        while (this.bicicleta.getRin() == 0){
            System.out.println("Ingrese el rin: (12-29)");
            int rin = sc.nextInt();
            sc.nextLine();
            this.bicicleta.setRin(rin);
        }
        this.bicicleta.getTipoFreno();
            System.out.println("Ingrese el tipo de freno: puede ser manzana, aro, tambor, pinza.  ");
            String freno = sc.next();
            sc.nextLine();
            this.bicicleta.setTipoFreno(freno);

    }
    public String imprimirValidacion(){
        return String.format("La %s, vendida por %s", this.bicicleta.imprimirBicicleta(),
                this.vendedor.imprimirVendedor(),this.cliente.imprimirCliente());
    }
}