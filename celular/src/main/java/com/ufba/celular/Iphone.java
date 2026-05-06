/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.celular;

/**
 *
 * @author vande
 */
public class Iphone {
    String marca;
    String modelo;
    String cor;
    int saudebateria;
    boolean carregado;
    boolean comprei;

    Iphone(String apple, String iphone_14_Pro, String preto, int i, boolean b, boolean b0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    void comprariphone(){
        if(saudebateria >= 85){
            this.comprei = true;
            System.out.println("Aparelho apto para aquisição.");
        }
        else{
            this.comprei = false;
            System.out.println("Aparelho degradado. Não recomendo a compra.");
        }
        
    }
    void carga(){
        if (carregado == true){
            System.out.println("Posso mexer!");
        } else {
            System.out.println("Sem bateria! Favor conectar ao carregador.");
        }
    }
    void resumodoaparelho(){
        System.out.println("A marca do aparelho é "+this.marca+";");
        System.out.println("Modelo: "+this.modelo+";");
        System.out.println("Cor:" +this.cor+";");
        System.out.println("Saúde da bateria: "+ this.saudebateria+";");
        
    }
}
