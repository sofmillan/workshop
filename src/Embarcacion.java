public class Embarcacion {

    private Capitan capitan;

    private int precioBase;

    private int valorAdicional;

    private int anioFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, int precioBase, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = 0;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public int calcularAlquiler(){
        if(this.anioFabricacion>2020){
            this.valorAdicional = 20000;
        }
        return this.precioBase + valorAdicional;
    }
}
