
package com.ufba.aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta "+ this.cor + ", modelo "+ this.modelo + ", com sua ponta "+ this.ponta +" com "+this.carga+" de carga.");
        System.out.println("Está tampada? "+ this.tampada);
    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO!");
        }
        else {
            System.out.println("Rabisco");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
