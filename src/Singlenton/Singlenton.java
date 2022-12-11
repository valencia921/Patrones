package Singlenton;

public class Singlenton {
    private   static  Singlenton singlenton;
    int contador;

    private Singlenton() {}

    public static Singlenton getInstance(){
        if(singlenton == null){
            singlenton = new Singlenton();
        }

        return singlenton;

    }
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
