/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendajuliocardenas;

import java.util.ArrayList;
import java.util.Date;

public class Venta {
    private int idVenta;
    private Date fecha;
    private ArrayList<Producto> productosVendidos;
    private double total;

    public Venta(int idVenta) {
        this.idVenta = idVenta;
        this.fecha = new Date();
        this.productosVendidos = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarProducto(Producto p, int cantidad) {
        if (p.getStock() >= cantidad) {
            p.setStock(p.getStock() - cantidad);
            productosVendidos.add(p);
            total += p.getPrecio() * cantidad;
        } else {
            System.out.println(" No hay suficiente stock de: " + p.getNombre());
        }
    }

    public void mostrarVenta() {
        System.out.println(" Venta #" + idVenta + " | Fecha: " + fecha);
        for (Producto p : productosVendidos) {
            System.out.println(p);
        }
        System.out.println("Total: S/ " + total);
    }
}