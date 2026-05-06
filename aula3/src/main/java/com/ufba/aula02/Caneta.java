
package com.ufba.aula02;
public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tampada? "+ this.tampada);
    }
    
    public  void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO!");
        }
        else {
            System.out.println("Rabisco");
        }
    }
    private void tampar(){
        this.tampada = true;
    }
    private void destampar(){
        this.tampada = false;
    }
}
