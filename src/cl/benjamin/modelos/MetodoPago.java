/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.benjamin.modelos;

/**
 *
 * @author molin
 */
public class MetodoPago {
    private int idPago;
    private String nombre;

    public MetodoPago(int idPago, String nombre) {
        this.idPago = idPago;
        this.nombre = nombre;
    }

    public MetodoPago(int idPago) {
        this.idPago = idPago;
    }
    

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "MetodoPago{" + "idPago=" + idPago + ", nombre=" + nombre + '}';
    }
    public void imprimir(){
        System.out.println(this.toString());
        
    }
    
}
