import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int idCliente=0;
        int idObra=0;
        int entradaTeclado=0;

        Obra[] misObras = new Obra[1000];

        System.out.println("""
                G.O.C.
                1.Añadir nueva obra.
                2.Consultar obra.
                3.Consultar cliente.
                4.Borrar datos.
                """);

        switch (entradaTeclado){
            case 1:

                Operaciones.crearObra(misObras,idObra);
                idObra++;
                break;
            case 2:

                break;
            case 3:

                break;
            default:
                break;

        }
    }
}