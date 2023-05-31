/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.biblioteca.Singleton;

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
        
    }
    
        private static Biblioteca instancia;
    private List<Libro> libros;
    private List<Revista> revistas;
    private List<Socio> socios;
    private List<Prestamo> prestamos;
    private List<Reserva> reservas;

    private Biblioteca() {
        libros = new ArrayList<>();
        revistas = new ArrayList<>();
        socios = new ArrayList<>();
        prestamos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public static Biblioteca getInstancia() {
        if (instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }

    // Métodos para libros
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

    // Métodos para revistas
    public void ingresarRevista(Revista revista) {
        revistas.add(revista);
    }

    public void modificarRevista(Revista revista) {
        // Lógica de modificación de revista
    }

    public void eliminarRevista(Revista revista) {
        revistas.remove(revista);
    }

    public List<Revista> listarRevistas() {
        return revistas;
    }

    public List<Revista> buscarRevistas(String criterio) {
        List<Revista> resultado = new ArrayList<>();
        // Lógica de búsqueda de revistas
        return resultado;
    }

    // Métodos para socios
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
 
    }


