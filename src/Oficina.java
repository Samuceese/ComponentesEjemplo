import java.io.Serializable;

public class Oficina implements Serializable {
    private int numeroOficina;
    private String ciudad;
    private String region;
    private int numeroDirector;
    private double objetivo;
    private double ventas;

    public Oficina() {}

    public Oficina(int numeroOficina, String ciudad, String region, int numeroDirector, double objetivo, double ventas) {
        this.numeroOficina = numeroOficina;
        this.ciudad = ciudad;
        this.region = region;
        this.numeroDirector = numeroDirector;
        this.objetivo = objetivo;
        this.ventas = ventas;
    }

    public int getNumeroOficina() { return numeroOficina; }
    public void setNumeroOficina(int numeroOficina) { this.numeroOficina = numeroOficina; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public int getNumeroDirector() { return numeroDirector; }
    public void setNumeroDirector(int numeroDirector) { this.numeroDirector = numeroDirector; }

    public double getObjetivo() { return objetivo; }
    public void setObjetivo(double objetivo) { this.objetivo = objetivo; }

    public double getVentas() { return ventas; }
    public void setVentas(double ventas) { this.ventas = ventas; }
}
