import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Cliente cliente = new Cliente();
        Camarero camarero = new Camarero();
        // Es importante que empiece el camarero ya que se queda esperando
        cliente.start();
        camarero.start();
        camarero.join();

    }


}

