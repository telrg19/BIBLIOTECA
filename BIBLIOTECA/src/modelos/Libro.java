/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Telma
 */
public class Libro {
    
    //*****************************************************************
    // Attributes 
    //*****************************************************************
    private String titulo;
    private String genero;
    private String autor;
    private String editorial;
    private int isbn;
    private int fechaPublicacion;
    
    //*****************************************************************
    // Constructors 
    //*****************************************************************
    public Libro(String titulo, String genero, String autor, String editorial, int isbn, int fechaPublicacion){
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
    }
    public Libro(){
        this("Tituto desconocido", "Genero desconocido", "Autor desconocido", "Editorial desconocida", 0, 0);
    }
    public Libro(Libro otro){
        this(otro.titulo, otro.genero, otro.autor, otro.editorial, otro.isbn, otro.fechaPublicacion);
    }
    
    
    
    
}
