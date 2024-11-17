/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudio.aplicacion.modelos;

import com.estudio.aplicacion.utils.Fecha;
import com.estudio.aplicacion.utils.Idioma;

/**
 *
 * @author Telma
 */
public class Revista extends Ejemplar {
    
    //*****************************************************************
    // Attributes 
    //*****************************************************************
    
    private int volumen;
    private String periodicidad;
    private String editor;
    
    //*****************************************************************
    // Constructors 
    //*****************************************************************
    
    public Revista(String titulo, String autor, Fecha fechaPublicacion, Idioma idioma, int volumen, String periodicidad, String editor){
        super(titulo, autor, fechaPublicacion, idioma);
        this.volumen = volumen;
        this.periodicidad = periodicidad;
        this.editor = editor;
    }
    
    public Revista(){
        super();
        this.volumen = 0;
        this.periodicidad = "Periodicidad Desconocida";
        this.editor = "Editor Desconocido";
    }
    
    public Revista (Revista otro){
        this.volumen = otro.volumen;
        this.periodicidad = otro.periodicidad;
        this.editor = otro.editor;
    }
    
    //*****************************************************************
    // Getters & Setters
    //*****************************************************************
    
    public int getVolumen(){
        return volumen;
    }
    
    public String getPeriodicidad(){
        return periodicidad;
    }
    
    public String getEditor(){
        return editor;
    }
    
    
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    
    public void setPeriodicidad(String periodicidad){
        this.periodicidad = periodicidad;
    }
    
    public void setEditor(String editor){
        this.editor = editor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Revista{");
        sb.append("volumen=").append(volumen);
        sb.append(", periodicidad=").append(periodicidad);
        sb.append(", editor=").append(editor);
        sb.append('}');
        return sb.toString();
    }
    
}
