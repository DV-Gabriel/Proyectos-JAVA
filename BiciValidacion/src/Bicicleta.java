public class Bicicleta {
    private String numeroSerie;
    private String tipoLlanta;
    private String tipoCuadro;
    private int marchas;
    private String color;
    private String tipoManubrio;
    private String modelo;
    private int rin;
    private String tipoFreno;



    public void Bicicleta(String numeroSerie ,String modelo, String color){
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.color = color;
        this.tipoLlanta = "";
        this.marchas = 0;
        this.tipoCuadro= "";
        this.tipoManubrio = "";
        this.rin = rin;
        this.tipoFreno = tipoFreno;
    }

    public String getTipoLlanta() {
        return this.tipoLlanta;
    }


    public void setTipoLlanta(String tipoLlanta) {

        if (tipoLlanta.equals("montañera") || tipoLlanta.equals("ruta") || tipoLlanta.equals("bmx")) {
            System.out.println("Llanta " + tipoLlanta + " seleccionada.");
            this.tipoLlanta = tipoLlanta;
        } else {
            System.out.println("Tipo de llanta no disponible. Ingrese otro.");
            this.tipoLlanta = "";
        }
    }

    public String getTipoCuadro() {
        return this.tipoCuadro;
    }

    public void setTipoCuadro(String tipoCuadro) {
        if (tipoCuadro.equals("acero") || tipoCuadro.equals("titanio") || tipoCuadro.equals("fibra de carbono") ||
                tipoCuadro.equals("aluminio")) {
            System.out.println("Cuadro de " + tipoCuadro + " seleccionado. ");
            this.tipoCuadro = tipoCuadro;
        } else {
            System.out.println("Tipo cuadro no disponible. Ingrese otro.");
            this.tipoCuadro = "";
        }
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getMarchas() {
        return this.marchas;
    }

    public void setMarchas(int marchas) {
        if (marchas >= 6 && marchas<= 24){
            System.out.println("Bici con " + marchas + "marchas.");
        } else {
            System.out.println("Marcha no registrada.");
            System.exit(0);
        }
        this.marchas = marchas;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoManubrio() {
        return this.tipoManubrio;
    }

    public void setTipoManubrio(String tipoManubrio) {
        switch (tipoManubrio){
            case "recto":
                System.out.println("Manubrio recto.");
                break;
            case "doble altura":
                System.out.println("Manubrio doble altura.");
                break;
            case "ruta":
                System.out.println("Manubrio ruta.");
                break;
            case "bmx" :
                System.out.println("Manubrio bmx.");
                break;
            case "mariposa" :
                System.out.println("Manubrio mariposa");
                break;
            default:
                System.out.println("Manubrio no disponible");
                System.exit(0);
                break;
        }
        this.tipoManubrio = tipoManubrio;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRin() {
        return this.rin;
    }

    public void setRin(int rin) {
        if(rin >= 12 && rin <= 29){
            System.out.println("Bici con rin numero:" + rin);
        }else{
            System.out.println("Rin no disponible.");
            System.exit(0);
        }
        this.rin = rin;
    }

    public String getTipoFreno() {
        return this.tipoFreno;
    }

    public void setTipoFreno(String tipoFreno) {
        switch (tipoFreno){
            case "manzana":
                System.out.println("Freno tipo manzana.");
                break;
            case "aro":
                System.out.println("Frenos tipo aro.");
                break;
            case "tambor":
                System.out.println("Freno tipo tambor.");
                break;
            case "pinza":
                System.out.println("Freno tipo pinza.");
                break;
            default:
                System.out.println("Freno no disponible.");
                System.exit(0);
                break;
        }
        this.tipoFreno = tipoFreno;
    }
    public String imprimirBicicleta(){

        return String.format("Bici con : %s, modelo: %s, color %s, con llanta  %s, bici con %d  marchas," +
                        "cuadro de  %s,manubrio tipo  %s, rin :%d,con freno tipo  %s",this.numeroSerie,
                this.modelo, this.color, this.tipoLlanta, this.marchas , this.tipoCuadro, this.tipoManubrio,
                this.rin, this.tipoFreno);
    }
}
