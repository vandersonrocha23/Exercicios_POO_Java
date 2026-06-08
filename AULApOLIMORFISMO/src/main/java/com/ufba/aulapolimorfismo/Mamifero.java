/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.aulapolimorfismo;

/**
 *
 * @author vande
 */
public class Mamifero extends Animal {
    private String corDoPelo;
    
    public Mamifero(float peso, int idade, int membros, String cor){
        super(peso, idade, membros);
        this.corDoPelo = cor;
    }
    @Override
    public void locomover(){
        System.out.println("Correndo!");
    }
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Sooooons");
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
    
    
    
    
    
}
