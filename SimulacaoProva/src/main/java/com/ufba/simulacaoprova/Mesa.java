/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.simulacaoprova;

import java.util.ArrayList;

/**
 *
 * @author vande
 */
public class Mesa {
    private int numero;
    private String cliente;
    private String cpf;
    private int qtdPessoas;
    private ArrayList<Prato> pratos;

    public Mesa(int numero, String cliente, String cpf, int qtdPessoas) {
        this.numero = numero;
        this.cliente = cliente;
        this.cpf = cpf;
        this.qtdPessoas = qtdPessoas;
        this.pratos = new ArrayList<>();
    }

    public Mesa(int numero, String cliente, String cpf, int qtdPessoas, Prato prato) {
        this.numero = numero;
        this.cliente = cliente;
        this.cpf = cpf;
        this.qtdPessoas = qtdPessoas;
        this.pratos.add(prato);
    }
    
    //Metodo para adicionar prato;
    public void adicionarPrato(Prato prato){
        pratos.add(prato);
    }
    
    //Remover prato por objeto 
    public void removerPrato(Prato prato, boolean autorizado){
        if(autorizado){
            pratos.remove(prato);
        }
    }
    public void removerPrato(int nmrPrato, boolean autorizado){
        if (autorizado){
            for (int i=0; i < pratos.size(); i++){
                if (pratos.get(i).getNmrPrato()==nmrPrato){
                    pratos.remove(i);
                    break;
                }
            }
        }
    }
    //Imprimir resultado;
    public void imprimirResultado(){
        System.out.println("Cliente: "+this.cliente);
        System.out.println("CPF " + this.cpf);
        System.out.println("Pratos consumidos: "+ pratos.size());
    }
    
    //Calcular valor total;
    public double calcularTotal(){
        double total;
        total = 0;
        for (Prato p: pratos){
            total += p.getValor();
        }
        return total;
    }
    
    //Imprimir conta;
    public void  imprimirConta(boolean detalhado){
        double total = calcularTotal();
        System.out.println("Nome: "+ cliente);
        System.out.println("Mesa: "+ numero);
        
        if (detalhado) {
            System.out.println("Pratos consumidos:");
            for (Prato p : pratos) {
                System.out.println(p);
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("Total: " + total);
            System.out.println("Valor por pessoa: " + (total / qtdPessoas));
        }
    }
    
}
