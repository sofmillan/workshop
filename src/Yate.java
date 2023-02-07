public class Yate extends Embarcacion{
    private int numCamarotes;

    public Yate(Capitan capitan, int precioBase, int anioFabricacion, double eslora, int numCamarotes) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.numCamarotes = numCamarotes;
    }

    public String tieneLujo(){
        if(this.numCamarotes>7){
            return "este yate tiene mayor lujo";
        }else{
            return "este yate tiene menor lujo";
        }
    }

    public void comprar(){
        System.out.println("Yate disponible para la compra");
    }
}
