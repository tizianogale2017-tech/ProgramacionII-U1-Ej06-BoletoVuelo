package Ejercicio6_boletoVuelo;

public class Main {
    public static void main(String[] args) {
        BoletoVuelo conEquipaje = new BoletoVuelo("Ana Torres", "Bariloche", 50000.0, true);
        BoletoVuelo sinEquipaje = new BoletoVuelo("Luis Díaz", "Bariloche", 50000.0, false);

        System.out.println(conEquipaje.getPasajero() + " a " + conEquipaje.getDestino()
                + " (con equipaje extra): $" + conEquipaje.calcularPrecioFinal());
        System.out.println(sinEquipaje.getPasajero() + " a " + sinEquipaje.getDestino()
                + " (sin equipaje extra): $" + sinEquipaje.calcularPrecioFinal());
    }
}
