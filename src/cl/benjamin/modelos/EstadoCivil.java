/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.benjamin.modelos;

/**
 *
 * @author benja
 */
public class EstadoCivil {
    private int idEst;
    private String nombre;

    public EstadoCivil(int idEst, String nombre) {
        this.idEst = idEst;
        this.nombre = nombre;
    }

    public EstadoCivil(int idEst) {
        this.idEst = idEst;
    }
    
    

    public int getIdEst() {
        return idEst;
    }

    public void setIdEst(int idEst) {
        this.idEst = idEst;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EstadoCivil{" + "idEst=" + idEst + ", nombre=" + nombre + '}';
    }
    
    public void imprimir(){
        System.out.println(this.toString());
    }
}
