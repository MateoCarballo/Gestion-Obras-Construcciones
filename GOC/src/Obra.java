import java.util.Arrays;

public class Obra {

    public int      idObra;
    public int      idCliente;
    public String   direccion;

    /**
     * En cada elemento de asuntoObra escribiremos el gasto
     * que se ha realizado en ese dia para la obra al acabarla si podremos tener la opcion de imprimir
     * dia por dia los gastos en la obra
     *
     * TODO deberiamos tener un acumulado de gastos para saber cuanto estamos gastando
     */

    public String [] asuntoObra= new String [30];
    public int      presupuesto;



    Obra(){

    }
    public Obra(int idObra,int idCliente, String [] asuntoObra, String direccion, int presupuesto) {
        this.asuntoObra=    asuntoObra;
        this.idObra=        idObra;
        this.idCliente=     idCliente;
        this.direccion =    direccion;
        this.presupuesto =  presupuesto;

    }

}
