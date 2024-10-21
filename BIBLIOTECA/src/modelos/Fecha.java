/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Telma
 */
public class Fecha {
    
    //*****************************************************************
    // Attributes 
    //*****************************************************************
    public int dia;
    public int mes;
    public int anio;
    
    //*****************************************************************
    // Constructors 
    //*****************************************************************
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public Fecha(){
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
    }
    
    public Fecha(Fecha otro){
        this.dia = otro.dia;
        this.mes = otro.mes;
        this.anio = otro.anio;
    }
    
    
    
    
}

