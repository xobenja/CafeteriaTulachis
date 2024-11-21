/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.benjamin.modelos;

/**
 *
 * @author benja
 */
public class Pedido {
    private int idPedido;
    private String nombre;
    private int Total;
    private Cafe cafe;
    private Cafe tamanio;
    private int Cantidad;
    private Cafe tipoL;
    private boolean cremaBatida;
    private boolean canela;
    private boolean jarabe;

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(int idPedido, String nombre, int Total, Cafe cafe, Cafe tamanio, int Cantidad, Cafe tipoL, boolean cremaBatida, boolean canela, boolean jarabe) {
        this.idPedido = idPedido;
        this.nombre = nombre;
        this.Total = Total;
        this.cafe = cafe;
        this.tamanio = tamanio;
        this.Cantidad = Cantidad;
        this.tipoL = tipoL;
        this.cremaBatida = cremaBatida;
        this.canela = canela;
        this.jarabe = jarabe;
    }

    
    
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public Cafe getTamanio() {
        return tamanio;
    }

    public void setTamanio(Cafe tamanio) {
        this.tamanio = tamanio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Cafe getTipoL() {
        return tipoL;
    }

    public void setTipoL(Cafe tipoL) {
        this.tipoL = tipoL;
    }

    public boolean isCremaBatida() {
        return cremaBatida;
    }

    public void setCremaBatida(boolean cremaBatida) {
        this.cremaBatida = cremaBatida;
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

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", nombre=" + nombre + ", Total=" + Total + ", cafe=" + cafe + ", tamanio=" + tamanio + ", Cantidad=" + Cantidad + ", tipoL=" + tipoL + ", cremaBatida=" + cremaBatida + ", canela=" + canela + ", jarabe=" + jarabe + '}';
    }
    
    
}
