/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendajuliocardenas;

import java.util.List;

import java.util.ArrayList;

import java.util.ArrayList;

public class AlgoritmosOrdenacion {

    // Ejemplo: Método Burbuja por precio
    public static void burbuja(ArrayList<Producto> productos) {
        int n = productos.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (productos.get(j).getPrecio() > productos.get(j + 1).getPrecio()) {
                    Producto temp = productos.get(j);
                    productos.set(j, productos.get(j + 1));
                    productos.set(j + 1, temp);
                }
            }
        }
    }
}
