/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.util.ArrayList;
/**
 *
 * @author 56950
 */
public class DAOEmpleados {
    private ArrayList<String> listaDatos; // Declaración de la lista

    public DAOEmpleados() {
        listaDatos = new ArrayList<>(); // Inicialización de la lista
    }

    // Método para agregar datos a la lista
    public void agregarDato(String dato) {
        listaDatos.add(dato); // Agrega el dato a la lista
    }

    // Método para obtener todos los datos
    public ArrayList<String> obtenerDatos() {
        return listaDatos; // Devuelve la lista de datos
    }
}

