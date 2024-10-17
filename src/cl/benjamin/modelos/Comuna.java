/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.benjamin.modelos;

/**
 *
 * @author molin
 */
public class Comuna {
    private int idComuna;
    private String nombre;
    private Provincia provincia;

    public Comuna(int idComuna, String nombre, Provincia provincia) {
        this.idComuna = idComuna;
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public Comuna(int idComuna) {
        this.idComuna = idComuna;
    }
    

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Comuna{" + "idComuna=" + idComuna + ", nombre=" + nombre + ", provincia=" + provincia + '}';
    }
    public void imprimir(){
        System.out.println(this.toString());
    }
    
}
