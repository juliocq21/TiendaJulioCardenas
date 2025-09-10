/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendajuliocardenas;


import java.util.ArrayList;

public class AlgoritmosBusqueda {

    // Ejemplo: Búsqueda lineal por nombre
    public static Producto busquedaLineal(ArrayList<Producto> productos, String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
}