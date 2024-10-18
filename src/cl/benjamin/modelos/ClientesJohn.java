
package cl.benjamin.modelos;

public class ClientesJohn {
    int id;
    String descripcion;
    int cantidad;
    String tamanio;
    double precio;
    double importe;

    public ClientesJohn() {
    }
    
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
