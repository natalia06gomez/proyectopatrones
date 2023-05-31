/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.biblioteca.Proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author linan
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

   

public class BibliotecaReal
        extends Biblioteca {
    List<Libro> libros;
    List<Socio> socios;
    List<Prestamo> prestamos;
    List<Reserva> reservas;

    public BibliotecaReal() {
        libros = new ArrayList<>();
        socios = new ArrayList<>();
        prestamos = new ArrayList<>();
        reservas = new ArrayList<>();
    }


    public void ingresarLibro(Libro libro) {
        libros.add(libro);
    }

    public void modificarLibro(Libro libro) {
        // Lógica de modificación de libro
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public List<Libro> listarLibros() {
        return libros;
    }

    public List<Libro> buscarLibros(String criterio) {
        List<Libro> resultado = new ArrayList<>();
        // Lógica de búsqueda de libros
        return resultado;
    }

    public void ingresarSocio(Socio socio) {
        socios.add(socio);
    }

    public void modificarSocio(Socio socio) {
        // Lógica de modificación de socio
    }

    public void eliminarSocio(Socio socio) {
        socios.remove(socio);
    }

    public List<Socio> listarSocios() {
        return socios;
    }

    public Socio consultarSocio(String numeroSocio) {
        Socio socioEncontrado = null;
        // Lógica de consulta de socio
        return socioEncontrado;
    }

    public void solicitarPrestamo(Prestamo prestamo) {
        // Lógica de solicitud de préstamo
    }

    public void hacerReserva(Reserva reserva) {
        // Lógica de creación de reserva
    }

    public void devolverLibro(Libro libro, Socio socio) {
        // Lógica de devolución de libro
    }

    public boolean comprobarDisponibilidad(Libro libro) {
        // Lógica de comprobación de disponibilidad
        return false;
    }

    public void extenderPlazoPrestamo(Libro libro, Socio socio) {
        // Lógica de extensión de plazo de préstamo
    }
    }

public class BibliotecaProxy extends Biblioteca {
    private BibliotecaReal bibliotecaReal;
    private Socio usuarioActual;

    public BibliotecaProxy(Socio usuarioActual) {
        this.usuarioActual = usuarioActual;
        bibliotecaReal = new BibliotecaReal();
    }

    public void ingresarLibro(Libro libro) {
        // Lógica de autorización para ingresar libros
        bibliotecaReal.ingresarLibro(libro);
    }

    public void modificarLibro(Libro libro) {
        // Lógica de autorización para modificar libros
        bibliotecaReal.modificarLibro(libro);
    }

    public void eliminarLibro(Libro libro) {
        // Lógica de autorización para eliminar libros
        bibliotecaReal.eliminarLibro(libro);
    }

    public List<Libro> listarLibros() {
        return bibliotecaReal.listarLibros();
    }

    public List<Libro> buscarLibros(String criterio) {
        return bibliotecaReal.buscarLibros(criterio);
    }

    public void ingresarSocio(Socio socio) {
        // Lógica de autorización para ingresar socios
        bibliotecaReal.ingresarSocio(socio);
    }

    public void modificarSocio(Socio socio) {
        // Lógica de autorización para modificar socios
        bibliotecaReal.modificarSocio(socio);
    }

    public void eliminarSocio(Socio socio) {
        // Lógica de autorización para eliminar socios
        bibliotecaReal.eliminarSocio(socio);
    }

    public List<Socio> listarSocios() {
        return bibliotecaReal.listarSocios();
    }

    public Socio consultarSocio(String numeroSocio) {
        return bibliotecaReal.consultarSocio(numeroSocio);
    }

    public void solicitarPrestamo(Prestamo prestamo) {
        // Lógica de autorización para solicitar préstamo
        bibliotecaReal.solicitarPrestamo(prestamo);
    }

    public void hacerReserva(Reserva reserva) {
        // Lógica de autorización para hacer reserva
        bibliotecaReal.hacerReserva(reserva);
    }

    public void devolverLibro(Libro libro, Socio socio) {
        // Lógica de autorización para devolver libro
        bibliotecaReal.devolverLibro(libro, socio);
    }

    public boolean comprobarDisponibilidad(Libro libro) {
        return bibliotecaReal.comprobarDisponibilidad(libro);
    }

    public void extenderPlazoPrestamo(Libro libro, Socio socio) {
        // Lógica de autorización para extender plazo de préstamo
        bibliotecaReal.extenderPlazoPrestamo(libro, socio);
    }
}

    
    
}

