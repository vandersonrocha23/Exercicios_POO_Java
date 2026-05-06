/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.bradesco;

/**
 *
 * @author vande
 */
public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoatual(){
        System.out.println("-----------------------");
        System.out.println("CONTA: "+this.getNumConta());
        System.out.println("DONO: "+this.getDono());
        System.out.println("TIPO: "+this.getTipo());
        System.out.println("SALDO: "+ this.getSaldo());
        System.out.println("STATUS: "+ this.getStatus());
        System.out.println("-----------------------");
        
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t=="CC") {
            this.setSaldo(50);
        } else if(t=="CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso! ");
    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta com dinheiro ");
        }else if(this.getSaldo()<0){
            System.out.println("Conta em débito ");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso! ");
        }
        
    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);  
            System.out.println("Depósito realizado na conta de  "+this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada");
        }
        
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            } else {
                System.out.println("Saldo insuficiete");  
            }
        } else{
            System.out.println("Impossivel sacar de conta fechada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v=12;  
        } else if (this.getTipo()=="CP"){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso por "+this.getDono());
            } else {
                System.out.println("Impossivel pagar, conta fechada");
        }
    }
    
    //Metodos especiais
    public ContaBancaria(){
        this.setStatus(false);
        this.setSaldo(0);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
