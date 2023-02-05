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
        return "######################### Cliente #########################"+ '\n' +
                "idCliente= " + idCliente +'\n' +
                "Nombre= " + nombre + '\n' +
                "Apellidos= " + apellidos + '\n' +
                "Fecha De Nacimiento= " + fechaDeNacimiento + '\n' +
                "Residencia= " + residencia + '\n' +
                "Código Postal= " + codigoPostal +
                "Teléfono de Contacto 1= " + telefonodeContacto1 + '\n' +
                "Teléfono de Contacto 2= " + telefonodeContacto2 + '\n' +
                "Correo Electrónico= " + correoElectronico + '\n' +
                "Obras Cliente={ " + Arrays.toString(obrasCliente) +
                '}';
    }
}
