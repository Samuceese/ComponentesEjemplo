import java.io.Serializable;

public class Vendedor implements Serializable {
    private int numeroEmpleado;
    private String nombre;
    private int edad;
    private int numeroOficina;
    private String oficio;
    private String fechaContrato;
    private int numeroDirector;
    private double cuota;
    private double ventas;


    public Vendedor(int numeroEmpleado, String nombre, int edad, int numeroOficina, String oficio,
                    String fechaContrato, int numeroDirector, double cuota, double ventas) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroOficina = numeroOficina;
        this.oficio = oficio;
        this.fechaContrato = fechaContrato;
        this.numeroDirector = numeroDirector;
        this.cuota = cuota;
        this.ventas = ventas;
    }


    public int getNumeroEmpleado() { return numeroEmpleado; }
    public void setNumeroEmpleado(int numeroEmpleado) { this.numeroEmpleado = numeroEmpleado; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public int getNumeroOficina() { return numeroOficina; }
    public void setNumeroOficina(int numeroOficina) { this.numeroOficina = numeroOficina; }

    public String getOficio() { return oficio; }
    public void setOficio(String oficio) { this.oficio = oficio; }

    public String getFechaContrato() { return fechaContrato; }
    public void setFechaContrato(String fechaContrato) { this.fechaContrato = fechaContrato; }

    public int getNumeroDirector() { return numeroDirector; }
    public void setNumeroDirector(int numeroDirector) { this.numeroDirector = numeroDirector; }

    public double getCuota() { return cuota; }
    public void setCuota(double cuota) { this.cuota = cuota; }

    public double getVentas() { return ventas; }
    public void setVentas(double ventas) { this.ventas = ventas; }
}
