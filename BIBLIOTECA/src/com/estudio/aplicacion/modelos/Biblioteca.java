/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudio.aplicacion.modelos;

import java.util.List;
import java.util.ArrayList;
        
/**
 *
 * @author Telma
 */
public class Biblioteca {
    
    //*****************************************************************
    // Attributes 
    //*****************************************************************
    
    private String nombre;
    private Bibliotecario bibliotecario;
    private List<Ejemplar> ejemplares;
    private List<Ejemplar> ejemplaresPrestados;
    private int cantidadEjemplares;
    private int cantidadEjemplaresPrestados;
    private int pos;
    
    public Biblioteca() {
    this.ejemplares = new ArrayList<>();
    this.ejemplaresPrestados = new ArrayList<>();
    }

    
    public Ejemplar ConsultarLibro(Ejemplar ejemplar){
        
        for (int i = 0; i < cantidadEjemplares; i++) {

            if (ejemplares.get(i).equals(ejemplar)) {
                pos = i;
                return ejemplares.get(i);
            }  
        }
        return null;
    }
    
    public void PrestarLibro(Ejemplar ejemplar){
        Ejemplar libroDisponible = ConsultarLibro(ejemplar);
        if(libroDisponible != null){
            AnadirPrestado(ejemplar);
            QuitarLibro(ejemplar);
            System.out.println("El libro se ha prestado");
        }else{
            System.out.println("El libro no esta disponible");
        }
    }
    
    public void DevolverLibro(Ejemplar ejemplar){
        if (ejemplaresPrestados.contains(ejemplar)) {
            AnadirLibro(ejemplar);
            QuitarPrestado(ejemplar);
        } else {
            System.out.println("El libro no está registrado como prestado.");
        }
    }
    
    public void AnadirLibro(Ejemplar ejemplar){
        if (!ejemplares.contains(ejemplar)) {
            ejemplares.add(ejemplar);
            cantidadEjemplares++;
        }
    }    
    
    public void QuitarLibro(Ejemplar ejemplar){
        ejemplares.remove(ejemplar);
        cantidadEjemplares--;
    }
    
    public void AnadirPrestado(Ejemplar ejemplar){
        ejemplaresPrestados.add(ejemplar);
        cantidadEjemplaresPrestados++;
    }
    
    public void QuitarPrestado(Ejemplar ejemplar){
        ejemplaresPrestados.remove(ejemplar);
        cantidadEjemplaresPrestados--;
    }

}
