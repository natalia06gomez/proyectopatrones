/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.biblioteca.Observador;

/**
 *
 * @author linan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        ObservadorBiblioteca observador = new ObservadorBiblioteca();

        // Agregar el observador a la biblioteca
        biblioteca.agregarObservador(observador);

        // Realizar alguna acción que notifique a los observadores
        biblioteca.ingresarLibro(new Libro());

        // Eliminar el observador de la biblioteca
        biblioteca.eliminarObservador(observador);
    }
}
    
    

