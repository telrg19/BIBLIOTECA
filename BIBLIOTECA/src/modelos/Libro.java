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
    
    //*****************************************************************
    // Getters & Setters
    //*****************************************************************
    public String getTitulo(){
        return titulo;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
    public int getIsbn(){
        return isbn;
    }
    
    public int getFechaPublicacion(){
        return fechaPublicacion;
    }
   
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setAutor(String autor) { 
        this.autor = autor;
    }
    public void setEditorial(String editorial) { 
        this.editorial = editorial;
    }
    public void setIsbn(int isbn) { 
        this.isbn = isbn;
    }
       public void setFechaPublicacion(int fechaPublicacion) { 
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
    
    
    
}
    