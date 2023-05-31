/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.Singleton;

/**
 *
 * @author linan
 */
class Socio {
    private String nombre;
    private String cedula;
    private TipoSocio tipoSocio;
    

    public Socio(String nombre, String cedula, TipoSocio tipoSocio) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.tipoSocio = tipoSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public TipoSocio getTipoSocio() {
        return tipoSocio;
    }

    public void setTipoSocio(TipoSocio tipoSocio) {
        this.tipoSocio = tipoSocio;
    }

   
}


