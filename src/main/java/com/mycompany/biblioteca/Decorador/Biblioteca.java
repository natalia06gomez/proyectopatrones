/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.biblioteca.Decorador;

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
        // TODO code application logic here
    }
    

    private void ingresarLibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void modificarLibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void eliminarLibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private List<Libro> listarLibros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private List<Libro> buscarLibros(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void ingresarSocio(Socio socio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void modificarSocio(Socio socio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void eliminarSocio(Socio socio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private List<Socio> listarSocios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Socio consultarSocio(String numeroSocio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void solicitarPrestamo(Libro libro, Socio socio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void hacerReserva(Libro libro, Socio socio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void devolverLibro(Libro libro, Socio socio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean comprobarDisponibilidad(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void extenderPlazoPrestamo(Libro libro, Socio socio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



public class BibliotecaBase extends Biblioteca {
    protected Biblioteca biblioteca;

    public BibliotecaBase(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void ingresarLibro(Libro libro) {
        biblioteca.ingresarLibro(libro);
    }

    public void modificarLibro(Libro libro) {
        biblioteca.modificarLibro(libro);
    }

    public void eliminarLibro(Libro libro) {
        biblioteca.eliminarLibro(libro);
    }

    public List<Libro> listarLibros() {
        return biblioteca.listarLibros();
    }

    public List<Libro> buscarLibros(String criterio) {
        return biblioteca.buscarLibros(criterio);
    }

    public void ingresarSocio(Socio socio) {
        biblioteca.ingresarSocio(socio);
    }

    public void modificarSocio(Socio socio) {
        biblioteca.modificarSocio(socio);
    }

    public void eliminarSocio(Socio socio) {
        biblioteca.eliminarSocio(socio);
    }

    public List<Socio> listarSocios() {
        return biblioteca.listarSocios();
    }

    public Socio consultarSocio(String numeroSocio) {
        return biblioteca.consultarSocio(numeroSocio);
    }

    public void solicitarPrestamo(Libro libro, Socio socio) {
        biblioteca.solicitarPrestamo(libro, socio);
    }

    public void hacerReserva(Libro libro, Socio socio) {
        biblioteca.hacerReserva(libro, socio);
    }

    public void devolverLibro(Libro libro, Socio socio) {
        biblioteca.devolverLibro(libro, socio);
    }

    public boolean comprobarDisponibilidad(Libro libro) {
        return biblioteca.comprobarDisponibilidad(libro);
    }

    public void extenderPlazoPrestamo(Libro libro, Socio socio) {
        biblioteca.extenderPlazoPrestamo(libro, socio);
    }
}

public class BibliotecaDecorator extends Biblioteca {
    private Biblioteca biblioteca;

    public BibliotecaDecorator(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void ingresarLibro(Libro libro) {
        biblioteca.ingresarLibro(libro);
    }

    public void modificarLibro(Libro libro) {
        biblioteca.modificarLibro(libro);
    }

    public void eliminarLibro(Libro libro) {
        biblioteca.eliminarLibro(libro);
    }

    public List<Libro> listarLibros() {
        return biblioteca.listarLibros();
    }

    public List<Libro> buscarLibros(String criterio) {
        return biblioteca.buscarLibros(criterio);
    }

    public void ingresarSocio(Socio socio) {
        biblioteca.ingresarSocio(socio);
    }

    public void modificarSocio(Socio socio) {
        biblioteca.modificarSocio(socio);
    }

    public void eliminarSocio(Socio socio) {
        biblioteca.eliminarSocio(socio);
    }

    public List<Socio> listarSocios() {
        return biblioteca.listarSocios();
    }

    public Socio consultarSocio(String numeroSocio) {
        return biblioteca.consultarSocio(numeroSocio);
    }

    public void solicitarPrestamo(Libro libro, Socio socio) {
        biblioteca.solicitarPrestamo(libro, socio);
    }

    public void hacerReserva(Libro libro, Socio socio) {
        biblioteca.hacerReserva(libro, socio);
    }

    public void devolverLibro(Libro libro, Socio socio) {
        biblioteca.devolverLibro(libro, socio);
    }

    public boolean comprobarDisponibilidad(Libro libro) {
        return biblioteca.comprobarDisponibilidad(libro);
    }

    public void extenderPlazoPrestamo(Libro libro, Socio socio) {
        biblioteca.extenderPlazoPrestamo(libro, socio);
    }
}
}

