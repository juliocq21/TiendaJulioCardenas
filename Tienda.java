/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendajuliocardenas;


import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    private String nombre;
    private Inventario inventario;
    private ArrayList<Venta> ventas;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.inventario = new Inventario();
        this.ventas = new ArrayList<>();
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== " + nombre + " =====");
            System.out.println("1. Gestionar Inventario");
            System.out.println("2. Registrar Venta");
            System.out.println("3. Listar Ventas");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> menuInventario(sc);
                case 2 -> menuVentas(sc);
                case 3 -> listarVentas();
                case 4 -> System.out.println(" Cerrando sistema...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    private void menuInventario(Scanner sc) {
        System.out.println("\n--- Inventario ---");
        System.out.println("1. Agregar producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Ordenar por precio (Burbuja)");
        System.out.print("Elige: ");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> {
                System.out.print("ID: "); int id = sc.nextInt();
                sc.nextLine(); // limpiar buffer
                System.out.print("Nombre: "); String nombre = sc.nextLine();
                System.out.print("Precio: "); double precio = sc.nextDouble();
                System.out.print("Stock: "); int stock = sc.nextInt();
                inventario.agregarProducto(new Producto(id, nombre, precio, stock));
            }
            case 2 -> inventario.listarProductos();
            case 3 -> {
                AlgoritmosOrdenacion.burbuja(inventario.getProductos());
                System.out.println(" Productos ordenados por precio.");
            }
        }
    }

    private void menuVentas(Scanner sc) {
        System.out.println("\n--- Registrar Venta ---");
        Venta v = new Venta(ventas.size() + 1);

        inventario.listarProductos();
        System.out.print("Ingresa ID del producto: ");
        int id = sc.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        for (Producto p : inventario.getProductos()) {
            if (p.getId() == id) {
                v.agregarProducto(p, cantidad);
            }
        }
        ventas.add(v);
        v.mostrarVenta();
    }

    private void listarVentas() {
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            for (Venta v : ventas) {
                v.mostrarVenta();
            }
        }
    }
}

