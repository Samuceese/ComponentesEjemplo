import java.io.Serializable;

public class Pedido implements Serializable {
    private int numeroPedido;
    private String fechaPedido;
    private int numeroCliente;
    private int numeroEmpleado;
    private String codigoFabrica;
    private String codigoProducto;
    private int cantidad;
    private double importe;

    public Pedido() {}

    public Pedido(int numeroPedido, String fechaPedido, int numeroCliente,
                  int numeroEmpleado, String codigoFabrica, String codigoProducto,
                  int cantidad, double importe) {
        this.numeroPedido = numeroPedido;
        this.fechaPedido = fechaPedido;
        this.numeroCliente = numeroCliente;
        this.numeroEmpleado = numeroEmpleado;
        this.codigoFabrica = codigoFabrica;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.importe = importe;
    }

    public int getNumeroPedido() { return numeroPedido; }
    public void setNumeroPedido(int numeroPedido) { this.numeroPedido = numeroPedido; }

    public String getFechaPedido() { return fechaPedido; }
    public void setFechaPedido(String fechaPedido) { this.fechaPedido = fechaPedido; }

    public int getNumeroCliente() { return numeroCliente; }
    public void setNumeroCliente(int numeroCliente) { this.numeroCliente = numeroCliente; }

    public int getNumeroEmpleado() { return numeroEmpleado; }
    public void setNumeroEmpleado(int numeroEmpleado) { this.numeroEmpleado = numeroEmpleado; }

    public String getCodigoFabrica() { return codigoFabrica; }
    public void setCodigoFabrica(String codigoFabrica) { this.codigoFabrica = codigoFabrica; }

    public String getCodigoProducto() { return codigoProducto; }
    public void setCodigoProducto(String codigoProducto) { this.codigoProducto = codigoProducto; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getImporte() { return importe; }
    public void setImporte(double importe) { this.importe = importe; }
}
