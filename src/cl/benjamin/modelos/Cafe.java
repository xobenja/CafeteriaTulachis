/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.benjamin.modelos;

/**
 *
 * @author molin
 */
public class Cafe {
    private int idNombre;
    private String nombre;
    private int precio;
    private char tamano;
    private String tipoLe;

    public Cafe(int idNombre, String nombre, int precio, char tamano, String tipoLe) {
        this.idNombre = idNombre;
        this.nombre = nombre;
        this.precio = precio;
        this.tamano = tamano;
        this.tipoLe = tipoLe;
    }

    public Cafe(int idNombre) {
        this.idNombre = idNombre;
    }

    
    public int getIdNombre() {
        return idNombre;
    }

    public void setIdNombre(int idNombre) {
        this.idNombre = idNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public char getTamano() {
        return tamano;
    }

    public void setTamano(char tamano) {
        this.tamano = tamano;
    }

    public String getTipoLe() {
        return tipoLe;
    }

    public void setTipoLe(String tipoLe) {
        this.tipoLe = tipoLe;
    }

    @Override
    public String toString() {
        return "Cafe{" + "idNombre=" + idNombre + ", nombre=" + nombre + ", precio=" + precio + ", tamano=" + tamano + ", tipoLe=" + tipoLe + '}';
    }
    
    
    public void imprimir(){
        System.out.println(this.toString());
        
    }
}
