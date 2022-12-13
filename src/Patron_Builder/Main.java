package Patron_Builder;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        Vehiculo coche = new VehiculoBuilder("MAZDA")
                .setmotor("v8")
                .setpuertas(5)
                .build();

        System.out.println("Marca: "+ coche.getMarca());
        System.out.println("Motor: "+ coche.getMotor());
        System.out.println("Puertas: "+ coche.getPuertas());

    }



}
