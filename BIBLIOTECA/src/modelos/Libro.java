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
    private String isbn;
    private int fechaPublicacion;
    
    //*****************************************************************
    // Constructors 
    //*****************************************************************
    public Libro(String titulo, String genero, String autor, String editorial, String isbn, int fechaPublicacion){
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
    }
    public Libro(){
        this("Tituto desconocido", "Genero desconocido", "Autor desconocido", "Editorial desconocida", "0-000-0000", 0);
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
    
    public String getIsbn(){
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
    public void setIsbn(String isbn) { 
        this.isbn = isbn;
    }
       public void setFechaPublicacion(int fechaPublicacion) { 
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("titulo=").append(titulo);
        sb.append(", genero=").append(genero);
        sb.append(", autor=").append(autor);
        sb.append(", editorial=").append(editorial);
        sb.append(", isbn=").append(isbn);
        sb.append(", fechaPublicacion=").append(fechaPublicacion);
        sb.append('}');
        return sb.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("El Quijote", "Novela de Aventuras", "Miguel de Cervantes", "Urbano Manini", "978273282", 1605);
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
        
        
        
        
        
        
        
        
        
    }    
    
    
    
    
    
}
    