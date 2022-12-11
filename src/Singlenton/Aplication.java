package Singlenton;

public class Aplication {
    private static  Aplication aplication;

    private Aplication(){}

    public static Aplication getInstance(){
        if(aplication == null){
            System.out.println("Arrancando!");
            aplication = new Aplication();
        }else {
            System.out.println("Estoy en ejecucion");
        }
        return aplication;
    }
    boolean isRunning = false;
    public void run(){
        if(!isRunning){
            isRunning=true;
        }
    }
}
