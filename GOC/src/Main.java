import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int entradaTeclado=0;
        Obra[] misObras = new Obra[1000];
        Cliente[] misClientes= new Cliente[100];

        System.out.println("""
                ######################
                ####### G.O.C. #######
                ######################
                1.Añadir nueva obra.
                2.Consultar obra.
                3.Modificar obra.
                4.Crear cliente.
                5.Consultar cliente.
                6.Modificar cliente.
                7.Borrar datos.
                """);

        switch (entradaTeclado){
            case 1:
                Operaciones.crearObra(misObras);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                Operaciones.crearCliente(misClientes);
                break;

            default:
                break;

        }
    }
}