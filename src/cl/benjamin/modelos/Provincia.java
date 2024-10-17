/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.benjamin.modelos;

/**
 *
 * @author molin
 */
public class Provincia {
    private int idProvincia;
    private String nombre;

    public Provincia(int idProvincia, String nombre) {
        this.idProvincia = idProvincia;
        this.nombre = nombre;
    }

    public Provincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
   

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Provincia{" + "idProvincia=" + idProvincia + ", nombre=" + nombre + '}';
    }
    public void imprimir(){
        System.out.println(this.toString());
    }
    
}
