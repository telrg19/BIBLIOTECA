/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudio.aplicacion.modelos;

import com.estudio.aplicacion.utils.Idioma;
import com.estudio.aplicacion.utils.Genero;
import com.estudio.aplicacion.utils.Fecha;

/**
 *
 * @author Telma
 */
public class Libro extends Ejemplar {
    
    //*****************************************************************
    // Attributes 
    //*****************************************************************

    private Genero genero;
    private String editorial;
    private String isbn;

    
    //*****************************************************************
    // Constructors 
    //*****************************************************************
    
    public Libro(String titulo, String autor, Fecha fechaPublicacion, Idioma idioma, Genero genero, String editorial, String isbn){
        super(titulo, autor, fechaPublicacion, idioma);
        this.genero = genero;
        this.editorial = editorial;
        this.isbn = isbn;
    }
    public Libro(){
        super();
        this.genero = Genero.DESCONOCIDO;
        this.editorial = "Editorial desconocida";
        this.isbn = "0-000-0000";
    }
    public Libro(Libro otro){
        this.genero = otro.genero;
        this.editorial = otro.editorial;
        this.isbn = otro.isbn; 
    }
    
    //*****************************************************************
    // Getters & Setters
    //*****************************************************************
    
    public Genero getGenero(){
        return genero;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
    public String getIsbn(){
        return isbn;
    }
    

    
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    public void setEditorial(String editorial) { 
        this.editorial = editorial;
    }
    
    public void setIsbn(String isbn) { 
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("genero=").append(genero);
        sb.append(", editorial=").append(editorial);
        sb.append(", isbn=").append(isbn);
        sb.append('}');
        return sb.toString();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("El Quijote", "Cervantes", new Fecha(16, 01, 1605),Idioma.ESPANIOL, Genero.AVENTURAS, "Urbano Manini", "978273282");
        Libro libro3 = new Libro(libro1);
        
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Genero: " + libro1.getGenero());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Editorial: " + libro1.getEditorial());
        System.out.println("ISBN: " + libro1.getIsbn());
        System.out.println("Fecha de Publicacion: " + libro1.getFechaPublicacion());
        System.out.println("Idioma: " + libro1.getIdioma());
        
        libro1.setTitulo("Don Quijote de la Mancha");
        System.out.println("Titulo: " + libro1.getTitulo());
        
        libro1.setGenero(Genero.AVENTURAS);
        System.out.println("Genero: " + libro1.getGenero());
        
        libro1.setAutor("Cervantes");
        System.out.println("Autor: " + libro1.getAutor());
        
        libro1.setEditorial("Urbano Manini");
        System.out.println("Editorial: " + libro1.getEditorial());
        
        libro1.setIsbn("978-1234567890");
        System.out.println("ISBN: " + libro1.getIsbn());
        
        libro1.setFechaPublicacion(new Fecha(16, 01, 1605));
        System.out.println("Fecha de Publicacion: " + libro1.getFechaPublicacion());
        
        libro1.setIdioma(Idioma.ESPANIOL);
        System.out.println("Idioma: " + libro1.getIdioma());
        
        System.out.println(libro1);
        
    }      
    
    
    
}
    