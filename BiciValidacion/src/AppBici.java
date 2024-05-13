import java.util.Scanner;

public class AppBici {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cliente cl1;
        System.out.println("Ingrese el nombre del comprador:");
        String nombre1 = sc.nextLine();
        System.out.println("Ingrese la forma de pago: ");
        String formaPago = sc.nextLine();
        System.out.println("Ingrese el numero de compras: ");
        int noCompras = sc.nextInt();
            if (noCompras >= 2){
                System.out.println("No se puede comprar mas de una bici.");
                System.exit(0);
            }
        cl1 = new Cliente(nombre1,formaPago,noCompras);
        System.out.println(cl1.imprimirCliente());
        Vendedor v1;
        v1 = new Vendedor("Gabriel Del Valle", 1234567894, 19,9);
        ValidacionBici vb1;
        vb1 = new ValidacionBici(v1,"18/06/2023", cl1);
        Bicicleta b1;
        b1 = new Bicicleta();
        vb1.setBicicleta(b1);
        vb1.ValidacionBici1();
        System.out.println(vb1.imprimirValidacion());
    }
}
