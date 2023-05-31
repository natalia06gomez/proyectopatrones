/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.biblioteca.Proxy;

import java.util.List;

/**
 *
 * @author linan
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     public interface Biblioteca {
    void ingresarLibro(Libro libro);
    void modificarLibro(Libro libro);
    void eliminarLibro(Libro libro);
    List<Libro> listarLibros();
    List<Libro> buscarLibros(String criterio);
    void ingresarSocio(Socio socio);
    void modificarSocio(Socio socio);
    void eliminarSocio(Socio socio);
    List<Socio> listarSocios();
    Socio consultarSocio(String numeroSocio);
    void solicitarPrestamo(Prestamo prestamo);
    void hacerReserva(Reserva reserva);
    void devolverLibro(Libro libro, Socio socio);
    boolean comprobarDisponibilidad(Libro libro);
    void extenderPlazoPrestamo(Libro libro, Socio socio);
}
}
