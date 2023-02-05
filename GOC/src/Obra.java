public class Obra {

    public int idObra;

    public int idCliente;
    public String direccion;
    public int presupuesto;
    public String fechaIncio;
    public String fechaFin;

    Obra(){

    }

    public Obra(int idObra,int idCliente, String direccion, int presupuesto, String fechaIncio,
                String fechaFin) {
        this.idObra=idObra;
        this.idCliente=idCliente;
        this.direccion = direccion;
        this.presupuesto = presupuesto;
        this.fechaIncio = fechaIncio;
        this.fechaFin = fechaFin;
    }
}
