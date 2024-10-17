/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.benjamin.modelos;

import java.util.Date;

/**
 *
 * @author benja
 */
public class Empleados {
    private int rut;
    private char dv;
    private String nombres;
    private String apePat;
    private String apeMat;
    private Date date;
    private boolean Masculino;
    private String correo;
    private int sueldo;
    private EstadoCivil estCivil;
    private int cantHijos;
    private Comuna comuna;

    public Empleados(int rut, char dv, String nombres, String apePat, String apeMat, Date date, boolean Masculino, String correo, int sueldo, EstadoCivil estCivil, int cantHijos, Comuna comuna) {
        this.rut = rut;
        this.dv = dv;
        this.nombres = nombres;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.date = date;
        this.Masculino = Masculino;
        this.correo = correo;
        this.sueldo = sueldo;
        this.estCivil = estCivil;
        this.cantHijos = cantHijos;
        this.comuna = comuna;
    }

    public Empleados(int rut) {
        this.rut = rut;
        this.dv = dv;
        
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isMasculino() {
        return Masculino;
    }

    public void setMasculino(boolean Masculino) {
        this.Masculino = Masculino;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public EstadoCivil getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(EstadoCivil estCivil) {
        this.estCivil = estCivil;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "Empleados{" + "rut=" + rut + ", dv=" + dv + ", nombres=" + nombres + ", apePat=" + apePat + ", apeMat=" + apeMat + ", date=" + date + ", sexo=" + Masculino+ ", correo=" + correo + ", sueldo=" + sueldo + ", estCivil=" + estCivil + ", cantHijos=" + cantHijos + ", comuna=" + comuna + '}';
    }
    
    public void imprimir (){
        System.out.println(this.toString());
    }
}
