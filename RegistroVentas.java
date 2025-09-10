/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendajuliocardenas;

import java.util.*;

public class RegistroVentas {
    private List<Venta> ventas = new ArrayList<>();

    public void registrarVenta(Venta v) {
        ventas.add(v);
        System.out.println(" Venta registrada: " + v);
    }

    public void mostrarVentas() {
        if (ventas.isEmpty()) {
            System.out.println(" No hay ventas registradas.");
            return;
        }
        for (Venta v : ventas) {
            System.out.println(v);
        }
    }
}
