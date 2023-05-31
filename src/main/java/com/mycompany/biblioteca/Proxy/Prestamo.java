/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.Proxy;

/**
 *
 * @author linan
 */
class Prestamo {
    private String titulo,autor;
    private int cantidadPrestados;
    
    public Prestamo(String titulo,String autor,int cantidadPrestados)
    {
     this.titulo=titulo;
     this.autor=autor;
     this.cantidadPrestados=cantidadPrestados;
    }

    public Prestamo() {
    }
    public String getTitulo() {
        return titulo;
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


    public int getCantidadPrestados() {
        return cantidadPrestados;
    }

    public void setCantidadPrestados(int cantidadPrestados) {
        this.cantidadPrestados = cantidadPrestados;
    }
    public boolean darPrestamo ()
    {
        boolean prestado=true;
        if(cantidadPrestados<cantidadPrestados)
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

 

