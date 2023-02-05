import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Operaciones {
    static private int idClienteclase =0;
    static private int idObraClase=0;
    public static void crearObra(Obra[]miObra) throws IOException {
        miObra[idObraClase]= new Obra();
        miObra[idObraClase].idObra=idObraClase;

        System.out.println("Obra registrada con exito"+"\n");
        añadirAsuntoObra(miObra,idObraClase,0);

        idObraClase++;
    }
    public static void crearCliente(Cliente[]micliente){
        micliente[idClienteclase]=new Cliente();
        micliente[idClienteclase].idCliente=idClienteclase;
        idClienteclase++;
        System.out.println("Cliente registrado con exito"+"\n");
    }

    public static void consultarObra(Obra[] misObras)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int busqueda;
        System.out.println("Introduce el id de la obra a consultar"+"\n");
        busqueda=Integer.parseInt(br.readLine());
        System.out.println(misObras[busqueda]);
    }
    public static void consultarCliente(Cliente[]misClientes)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int busqueda;
        System.out.println("Introduce el id del cliente a consultar");
        busqueda=Integer.parseInt(br.readLine());
        System.out.println(misClientes[busqueda]);

    }

    public static void añadirAsuntoObra(Obra[]miObra,int idObra,int diaAsunto)throws IOException {
        String entradaTeclado="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Quieres añadir un breve resumen del proyecto? (Y/N)");
        entradaTeclado= br.readLine();
        if(entradaTeclado.compareToIgnoreCase("Y")==0){
            System.out.println("\n"+"Introduce tu descripccion y pulsa enter");
            miObra[idObra].asuntoObra.add(br.readLine());
        }
    }

    public static void escribirTodo(Cliente[]misClientes){
        for (int i = 0; i < misClientes.length; i++) {
            System.out.println((misClientes[i]));
        }
    }
    public static void escribirTodo(Obra[]misObras){
        for (int i = 0; i < misObras.length; i++) {
            System.out.println((misObras[i]));
        }
    }
    public static void borrarDatos(){

    }


}
