package Singlenton;

public class Main {
    public static void main(String[] args) {
      Aplication app = Aplication.getInstance();
      Aplication app2 = Aplication.getInstance();

      app.run();
      app2.run();

        System.out.println(app + " "+ app2);

    }
}
