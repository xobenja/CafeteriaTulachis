/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.util.ArrayList;
import cl.benjamin.modelos.Pedido;
/**
 *
 * @author benja
 */
public class DAOPedido {
    private static ArrayList<Pedido> lPedido = new ArrayList<Pedido>();

    // Agregar pedido a la lista
    public static void agregar(Pedido pedido) {
        lPedido.add(pedido);
    }

    // Obtener la lista completa de pedidos
    public static ArrayList<Pedido> obtenerLista() {
        return lPedido;
    }
    
    
    public static ArrayList<Pedido> obtenerPedidos() {
        return new ArrayList<>(lPedido); // Devuelve una copia de lPedido
    }
    
   // Buscar un pedido por su Rut
    public static Pedido buscarPorRut(int rut) {
        // Recorremos la lista de pedidos
        for (Pedido pedido : lPedido) {
            // Si el Rut coincide, devolvemos el pedido
            if (pedido.getIdPedido()== rut) {
                return pedido;
            }
        }
        // Si no encontramos el pedido, devolvemos null
        return null;
    }
    
     // Eliminar un pedido de la lista
    public static void eliminar(Pedido pedido) {
        // Intentamos eliminar el pedido de la lista
        lPedido.remove(pedido);
    }
}
