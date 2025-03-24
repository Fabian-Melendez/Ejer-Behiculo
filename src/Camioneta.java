public class Camioneta extends Vehiculo{
    protected double kg;

    public Camioneta() {
    }

    public Camioneta(String mar, String mod, int año, int pre, boolean dis, double kg) {
        super(mar, mod, año, pre, dis);
        this.kg = kg;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return super.toString() +
                "kg=" + kg +
                '}';
    }
    public void mostInfo(){
        super.mostInfo();
        System.out.println("Carga maxima del vehiculo en Kg: "+kg);
    }
}
