/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.benjamin.modelos;

/**
 *
 * @author molin
 */
public class Cafeterias {
    private int idCafeteria;
    private String nombre;
    private Comuna comuna;

    public Cafeterias(int idCafeteria, String nombre, Comuna comuna) {
        this.idCafeteria = idCafeteria;
        this.nombre = nombre;
        this.comuna = comuna;
    }

    public Cafeterias(int idCafeteria) {
        this.idCafeteria = idCafeteria;
    }
    

    public int getIdCafeteria() {
        return idCafeteria;
    }

    public void setIdCafeteria(int idCafeteria) {
        this.idCafeteria = idCafeteria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "Cafeterias{" + "idCafeteria=" + idCafeteria + ", nombre=" + nombre + ", comuna=" + comuna + '}';
    }
    public void imprimir(){
        System.out.println(this.toString());
         }
    }

   