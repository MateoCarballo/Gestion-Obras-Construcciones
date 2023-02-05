import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Operaciones {
    static private int idClienteclase =0;
    static private int idObraClase=0;
    public static void crearObra(ArrayList<Obra> misObras) throws IOException {
        misObras.add(new Obra());
        misObras.

        System.out.println("Obra registrada con exito"+"\n");
        añadirAsuntoObra(miObra,idObraClase,0);

        idObraClase++;
    }
    public static void crearCliente(ArrayList<Cliente> micliente){

        micliente[idClienteclase]=new Cliente();
        micliente[idClienteclase].idCliente=idClienteclase;
        idClienteclase++;
        System.out.println("Cliente registrado con exito"+"\n");
    }

    public static void consultarObra(ArrayList<Obra> misObras)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int busqueda;
        System.out.println("Introduce el id de la obra a consultar"+"\n");
        busqueda=Integer.parseInt(br.readLine());
        System.out.println(misObras.get(busqueda));
        /**
         * TODO pendiente de implementar control de errores
         */
    }
    public static void consultarCliente(ArrayList<Cliente> misClientes)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int busqueda;
        System.out.println("Introduce el id del cliente a consultar");
        busqueda=Integer.parseInt(br.readLine());
        System.out.println(misClientes.get(busqueda));
        /**
         * TODO pendiente de implementar control de errores
         */
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

    public static void borrarDatos(){

    }
    /**
     * Como recorrer elementos de una arraylist
     */
    public static void escribirArrayListCliente(ArrayList<Cliente> miArrayList) {
        Iterator<Cliente> miIterador = miArrayList.iterator();
        while (miIterador.hasNext()) {
            Cliente miCliente = miIterador.next();
            System.out.print(miCliente);
        }
    }
    public static void escribirArrayListObra(ArrayList<Obra> miArrayList) {
        Iterator<Obra> miIterador = miArrayList.iterator();
        while (miIterador.hasNext()) {
            Obra miObra = miIterador.next();
            System.out.print(miObra);
        }
    }
}
