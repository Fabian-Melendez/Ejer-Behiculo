public class Cliente {
    protected String nom;
    protected String cc;
    protected String nLic;

    public Cliente() {
    }

    public Cliente(String nom, String cc, String nLic) {
        this.nom = nom;
        this.cc = cc;
        this.nLic = nLic;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getnLic() {
        return nLic;
    }

    public void setnLic(String nLic) {
        this.nLic = nLic;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nom='" + nom + '\'' +
                ", cc='" + cc + '\'' +
                ", nLic='" + nLic + '\'' +
                '}';
    }
    public void mosInfo(){
        System.out.printf("Nombre del cliente: "+nom);
        System.out.printf("Cedula del cliente: "+cc);
        System.out.printf("Numero del licencia: "+nLic);
    }
}
