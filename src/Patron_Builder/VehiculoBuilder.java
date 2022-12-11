package Patron_Builder;

public class VehiculoBuilder {
    Vehiculo vehiculo;
    public VehiculoBuilder(String marca) {
        vehiculo = new Vehiculo();
        vehiculo.setMarca(marca);
    }

    public VehiculoBuilder setpuertas (int puertas){
        vehiculo.setPuertas(puertas);
        return this;
    }
    public VehiculoBuilder setmotor (String motor){
        vehiculo.setMotor(motor);
        return this;
    }

    public Vehiculo build(){
        return this.vehiculo;
    }
}
