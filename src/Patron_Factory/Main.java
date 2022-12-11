package Patron_Factory;

public class Main {
    public static void main(String[] args) {
        PrecioFactory precio1 = new PrecioFactory("España");
        System.out.println(precio1.getPrecio());
        PrecioFactory precio2 = new PrecioFactory("Usa");
        System.out.println(precio2.getPrecio());
    }
}
