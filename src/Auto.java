public class Auto extends Vehiculo{
    protected int nPts;

    public Auto() {
    }

    public Auto(String mar, String mod, int año, int pre, boolean dis, int nPts) {
        super(mar, mod, año, pre, dis);
        this.nPts = nPts;
    }

    public int getnPts() {
        return nPts;
    }

    public void setnPts(int nPts) {
        this.nPts = nPts;
    }

    @Override
    public String toString() {
        return super.toString() +
                "nPts=" + nPts +
                '}';
    }
    public void mostInfo(){
        super.mostInfo();
        System.out.println("Numero de puertas: "+nPts);
    }
}
