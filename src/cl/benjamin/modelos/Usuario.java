/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.benjamin.modelos;

/**
 *
 * @author molin
 */
public class Usuario {
    private int rut;
    private String nombre;
    private Cafe cafe;
    private MetodoPago maPag;
    private Cafeterias cafeteria;
    

    public Usuario(int rut, String nombre, Cafe cafe, MetodoPago maPag, Cafeterias cafeteria) {
        this.rut = rut;
        this.nombre = "";
        this.cafe = null;
        this.maPag = maPag;
        this.cafeteria = cafeteria;
    }

    public Usuario(int rut) {
        this.rut = rut;
    }
    

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public MetodoPago getMaPag() {
        return maPag;
    }

    public void setMaPag(MetodoPago maPag) {
        this.maPag = maPag;
    }

    public Cafeterias getCafeteria() {
        return cafeteria;
    }

    public void setCafeteria(Cafeterias cafeteria) {
        this.cafeteria = cafeteria;
    }

    @Override
    public String toString() {
        return "Usuario{" + "rut=" + rut + ", nombre=" + nombre + ", cafe=" + cafe + ", maPag=" + maPag + ", cafeteria=" + cafeteria + '}';
    }
    public void imprimir(){
        System.out.println(this.toString());
    }
    
    
    
    
    
    
}
