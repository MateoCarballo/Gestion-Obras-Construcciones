import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int entradaTeclado;

        ArrayList<Obra> misObras = new ArrayList<Obra>();
        ArrayList<Cliente> misClientes = new ArrayList<Cliente>();
        do {
        System.out.println("""
                ######################
                ####### G.O.C. #######
                ######################
                1.Nueva obra.
                2.Consultar obra.
                3.Modificar obra.
                4.Nuevo cliente.
                5.Consultar cliente.
                6.Modificar cliente.
                8.Mostras el numero de clientes y obras acumulados.
                9.Salir.
                """);

        Scanner leerTeclado= new Scanner(System.in);
        entradaTeclado= leerTeclado.nextInt();

        switch (entradaTeclado) {
            case 1:
                Operaciones.crearObra(misObras);
                break;
            case 2:
                Operaciones.consultarObra(misObras);
                break;
            case 3:
                break;
            case 4:
                Operaciones.crearCliente(misClientes);
                break;
            case 5:
                Operaciones.consultarCliente(misClientes);
                break;
            case 7:
                //Operaciones.escribirArrayListCliente(misClientes);
                Operaciones.escribirArrayListObra(misObras);
                break;
            case 8:
                break;
            default:
                break;
        }

        }while(entradaTeclado!=9);
    }
}
