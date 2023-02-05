import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int entradaTeclado=0;
        Obra[] misObras = new Obra[1000];
        Cliente[] misClientes= new Cliente[100];

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

            default:
                break;
        }

        }while(entradaTeclado!=9);
    }
}
