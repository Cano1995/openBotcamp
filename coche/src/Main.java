public class Main {
    public static void main(String[] args) {
        Coche myCoche=new Coche();
        myCoche.MasPuerta();
        System.out.println("El coche tiene "+myCoche.puertas+" Puertas");
    }
}
class Coche{
    public int puertas=4;
    public void MasPuerta(){
        this.puertas++;
    }
}