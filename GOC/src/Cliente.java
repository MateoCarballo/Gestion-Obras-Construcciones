public class Cliente {
    //como referenciarlos en la aplicacion
    public int idCliente;

    //Datos personales
    public String   nombre;
    public String   apellidos;
    public String   fechaDeNacimiento;
    public String   residencia;
    public int      codigoPostal;
    public String   telefonodeContacto1;
    public String   telefonodeContacto2;
    public String   correoElectronico;

    //Datos de sus obras
    public int [] obrasCliente = new int [100];
    Cliente(){

    }
}
