import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operaciones {
    static private int idClienteclase =0;
    static private int idObraClase=0;
    public static void crearObra(Obra[]miObra) throws IOException {

        miObra[idObraClase]= new Obra();
        miObra[idObraClase].idObra=idObraClase;
    }
    public static void crearCliente(Cliente[] micliente){
        micliente[idClienteclase]=new Cliente();
        micliente[idClienteclase].idCliente=idClienteclase;
    }
    public static void añadirNuevaObra(){

    }
    public static void consultarObra(){

    }
    public static void consultarCliente(){

    }
    public static void borrarDatos(){

    }

    public static void crearCliente(){

    }
}
