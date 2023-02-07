public class Velero extends Embarcacion {
    private int numMastiles;

    public Velero(Capitan capitan, int precioBase, int anioFabricacion, double eslora, int numMastiles) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.numMastiles = numMastiles;
    }

    public String esGrande(){
        if(this.numMastiles>4){
            return "este velero es grande.";
        }else{
            return "este velero es pequeño.";
        }
    }
}
