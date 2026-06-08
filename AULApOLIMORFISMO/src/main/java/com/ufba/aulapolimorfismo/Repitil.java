/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.aulapolimorfismo;

/**
 *
 * @author vande
 */
public class Repitil extends Animal {
    private String corEscama;
    public Repitil (float peso, int idade, int membros, String cor){
        super(peso, idade, membros);
        this.corEscama = cor;
    }
    
    @Override
    public void locomover(){
        System.out.println("Ratejando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Vegetais");
    }
    @Override
    public void emitirSom(){
        System.out.println("Waaar");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
