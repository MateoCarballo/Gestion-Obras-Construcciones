import java.util.Arrays;

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

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", residencia='" + residencia + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", telefonodeContacto1='" + telefonodeContacto1 + '\'' +
                ", telefonodeContacto2='" + telefonodeContacto2 + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", obrasCliente=" + Arrays.toString(obrasCliente) +
                '}';
    }
}
