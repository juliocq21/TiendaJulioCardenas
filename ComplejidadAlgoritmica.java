/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package complejidadalgoritmica;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class ComplejidadAlgoritmica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] miArreglo = {10, 20, 30, 40, 50};

        int valorBuscado = 30;
        
        System.out.println("{10, 20, 30, 40, 50}");
        
        System.out.println("EL VALOR BUSCADO ES 30 EN QUE INDICE ESTÁ?");

        int resultado = buscarElemento(miArreglo, valorBuscado);


        if (resultado != -1) {
            System.out.println("Elemento encontrado en el índice: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }

    public static int buscarElemento(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i; // Retorna el índice donde se encontró
            }
        }
        return -1; // Retorna -1 si no se encuentra
    }
}
