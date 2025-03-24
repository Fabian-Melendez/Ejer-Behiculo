public class Vehiculo {
    protected String mar;
    protected String mod;
    protected int año;
    protected int pre;
    protected boolean dis =true;

    public Vehiculo() {
    }

    public Vehiculo(String mar, String mod, int año, int pre, boolean dis) {
        this.mar = mar;
        this.mod = mod;
        this.año = año;
        this.pre = pre;
        this.dis = dis;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPre() {
        return pre;
    }

    public void setPre(int pre) {
        this.pre = pre;
    }

    public boolean isDis() {
        return dis;
    }

    public void setDis(boolean dis) {
        this.dis = dis;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "mar='" + mar + '\'' +
                ", mod='" + mod + '\'' +
                ", año=" + año +
                ", pre=" + pre +
                ", dis=" + dis +
                '}';
    }
    public void mostInfo(){
        System.out.println("Marca del vehiculo: "+mar);
        System.out.println("Modelo del vehiculo: "+mod);
        System.out.println("Año del vehiculo: "+año);
        System.out.println("Precio de alquiler: "+pre);
        System.out.println("Disponibilidad del vehiculo: "+dis);
    }
}
