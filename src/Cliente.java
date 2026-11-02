import java.io.Serializable;

public class Cliente implements Serializable {
    private int numeroCliente;
    private String empresa;
    private int numeroEmpleado;
    private double limiteCredito;

    public Cliente() {}

    public Cliente(int numeroCliente, String empresa, int numeroEmpleado, double limiteCredito) {
        this.numeroCliente = numeroCliente;
        this.empresa = empresa;
        this.numeroEmpleado = numeroEmpleado;
        this.limiteCredito = limiteCredito;
    }

    public int getNumeroCliente() { return numeroCliente; }
    public void setNumeroCliente(int numeroCliente) { this.numeroCliente = numeroCliente; }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    public int getNumeroEmpleado() { return numeroEmpleado; }
    public void setNumeroEmpleado(int numeroEmpleado) { this.numeroEmpleado = numeroEmpleado; }

    public double getLimiteCredito() { return limiteCredito; }
    public void setLimiteCredito(double limiteCredito) { this.limiteCredito = limiteCredito; }
}
