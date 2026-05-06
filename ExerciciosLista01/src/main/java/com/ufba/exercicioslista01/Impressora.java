/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.exercicioslista01;

/**
 *
 * @author vande
 */
public class Impressora {
    public String fabricante;
    public String modelo;
    public String tecnologia;
    public int capacidade;
    public int velocidade;
    
    public double tempoImpressão(double tempoimpressao){
        return (double) tempoimpressao / getVelocidade();
    }
    
    public String getFabricante(){
        return this.fabricante;
    }
    public void setFabricante(String f){
        this.fabricante = f;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getTecnologia(){
        return this.tecnologia;
    }
    public void setTecnologia(String t){
        this.tecnologia = t;
    }
    public int getCapacidade(){
        return this.capacidade;
    }
    public void setCapacidade(int c){
        this.capacidade = c;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(int v){
        this.velocidade = v;
    }
    
}
