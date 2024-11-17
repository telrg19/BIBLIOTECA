/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudio.aplicacion.modelos;

/**
 *
 * @author Telma
 */
public class Bibliotecario {
    
    //*****************************************************************
    // Attributes 
    //*****************************************************************
    
    private String id;
    private String nombre;
    
    
    //*****************************************************************
    // Constructors 
    //*****************************************************************
    
    public Bibliotecario(String id, String nombre){
        this.id= id;
        this.nombre = nombre;
    }
    
    //*****************************************************************
    // Getters & Setters
    //*****************************************************************

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bibliotecario{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }    
}
