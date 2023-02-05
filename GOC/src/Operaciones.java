import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operaciones {

    public static void añadirNuevaObra(){

    }
    public static void consultarObra(){

    }
    public static void consultarCliente(){

    }
    public static void borrarDatos(){

    }
    public static void crearObra(Obra[] misObras,int contadorObras) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        misObras[contadorObras]= new Obra();
        System.out.println("Direccion de la obra?");
        misObras[contadorObras].direccion=br.readLine();
        System.out.println("Fecha de inicio de la obra?");
        misObras[contadorObras].fechaIncio=br.readLine();
        System.out.println("Que materiales has usado?");

    }
    public static void crearCliente(){

    }
}
