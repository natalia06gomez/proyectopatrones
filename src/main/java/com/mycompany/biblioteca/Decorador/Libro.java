/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.Decorador;

/**
 *
 * @author linan
 */
class Libro {

    String getTitulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String titulo,autor;
    private int cantidadEjemplares, cantidadPrestados;

    public Libro() {
    }

    public Libro(String titulo,String autor,int cantidadEjemplares,int cantidadPrestados)
    {
     this.titulo=titulo;
     this.autor=autor;
     this.cantidadEjemplares=cantidadEjemplares;
     this.cantidadPrestados=cantidadPrestados;
    
    }   

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getCantidadPrestados() {
        return cantidadPrestados;
    }

    public void setCantidadPrestados(int cantidadPrestados) {
        this.cantidadPrestados = cantidadPrestados;
    }
    public boolean darPrestamo ()
    {
        boolean prestado=true;
        if(cantidadPrestados<cantidadEjemplares)
        {
            cantidadPrestados++;
        }
        else
        {
           prestado=false; 
        }
        return prestado;
        
    }
    
    public boolean devolverLibro()
    {
        boolean devolver = true;
        if(cantidadPrestados==0)
        {
            devolver=false;
    }
        return devolver;
}

}


