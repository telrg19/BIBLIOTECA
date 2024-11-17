/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudio.aplicacion.modelos;

import com.estudio.aplicacion.utils.Idioma;
import com.estudio.aplicacion.utils.Fecha;

/**
 *
 * @author Telma
 */
public class Ejemplar {
    //*****************************************************************
    // Attributes 
    //*****************************************************************
    private String titulo;
    private String autor;
    private Fecha fechaPublicacion;
    private Idioma idioma;
    
    //*****************************************************************
    // Constructors 
    //*****************************************************************
    
    public Ejemplar(String titulo, String autor, Fecha fechaPublicacion, Idioma idioma){
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.idioma = idioma;
    }
    public Ejemplar(){
        this.titulo = "Titulo Desconocido";
        this.autor = "Autor Desconocido";
        this.fechaPublicacion = new Fecha();
        this.idioma = Idioma.ESPANIOL;
    } 
    public Ejemplar(Ejemplar otro){
        this.titulo = otro.titulo;
        this.autor = otro. autor;
        this.fechaPublicacion = otro.fechaPublicacion;
        this.idioma = otro.idioma;
    }
    
    public Ejemplar(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
        
    //*****************************************************************
    // Getters & Setters
    //*****************************************************************
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
            
    public Fecha getFechaPublicacion(){
        return fechaPublicacion;
    }
    
    public Idioma getIdioma(){
        return idioma;
    }
    
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
          
    public void setAutor(String autor){
        this.autor = autor;
    }     
    
    public void setFechaPublicacion(Fecha fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
    
    public void setIdioma(Idioma idioma){
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion + ", idioma=" + idioma + '}';
    }

    public Object getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
