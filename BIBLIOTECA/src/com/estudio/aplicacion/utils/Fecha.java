/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudio.aplicacion.utils;

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
    
    //*****************************************************************
    // Getters & Setters
    //*****************************************************************
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAnio(){
        return anio;
    }
    
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha{");
        sb.append("dia=").append(dia);
        sb.append(", mes=").append(mes);
        sb.append(", anio=").append(anio);
        sb.append('}');
        return sb.toString();
    }
    
}

