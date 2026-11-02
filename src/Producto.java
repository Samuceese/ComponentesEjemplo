import java.io.Serializable;

public class Producto implements Serializable {
    private String codigoFabrica;
    private String codigoProducto;
    private String descripcion;
    private double precio;
    private int existencias;

    public Producto() {}

    public Producto(String codigoFabrica, String codigoProducto, String descripcion,
                    double precio, int existencias) {
        this.codigoFabrica = codigoFabrica;
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
    }

    public String getCodigoFabrica() { return codigoFabrica; }
    public void setCodigoFabrica(String codigoFabrica) { this.codigoFabrica = codigoFabrica; }

    public String getCodigoProducto() { return codigoProducto; }
    public void setCodigoProducto(String codigoProducto) { this.codigoProducto = codigoProducto; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getExistencias() { return existencias; }
    public void setExistencias(int existencias) { this.existencias = existencias; }
}
