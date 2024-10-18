
package cl.benjamin.modelos;

public class ClientesJohn {
    int id;
    String descripcion;
    int cantidad;
    String tamanio;
    String tipoL;
    double precio;
    double importe;
    boolean cremabatida;
    boolean canela;
    boolean jarabe;

    public ClientesJohn() {
    }

    public boolean isCremabatida() {
        return cremabatida;
    }

    public void setCremabatida(boolean cremabatida) {
        this.cremabatida = cremabatida;
    }

    public boolean isCanela() {
        return canela;
    }

    public void setCanela(boolean canela) {
        this.canela = canela;
    }

    public boolean isJarabe() {
        return jarabe;
    }

    public void setJarabe(boolean jarabe) {
        this.jarabe = jarabe;
    }

    
    
    public String getTipoL() {
        return tipoL;
    }

    public void setTipoL(String tipoL) {
        this.tipoL = tipoL;
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
