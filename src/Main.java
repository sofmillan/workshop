public class Main {
    public static void main(String[] args) {

        Capitan capitanRicardo = new Capitan("Ricardo","Mazo","123-A");
        Capitan capitanSofia = new Capitan("Sofía","Millán","456-B");

        Yate yate = new Yate(capitanRicardo,5000000,2021,15.6,4);
        Velero velero = new Velero(capitanSofia,3000000,2015,8.9,5);
        System.out.println("El valor del alquiler  de la primera embarcación es "+yate.calcularAlquiler()+ " y "+yate.tieneLujo());
        yate.comprar();

        System.out.println("El valor del alquiler de la segunda embarcación es "+velero.calcularAlquiler()+" y "+velero.esGrande());




    }
}