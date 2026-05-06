/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.atividadecomputador;

/**
 *
 * @author vande
 */
public class Computador {
    private Processador cpu;
    private MemoriaRam ram;
    private Fonte fonte;
    private ArmazenamentoInterno ssd;
    private boolean funcionando;
    
    
    //public Computador(String modeloCPU){
        //this.cpu = new Processador(modeloCPU);
    //}
    //public void ligar(){
       // System.out.println("Computador ligando com o processador"+ cpu.getModelo());
    //}
    //public void ligar(String usuario){
        //System.out.println("Seja bem vindo "+ usuario);
    //}

    public Computador(Processador cpu, MemoriaRam ram, Fonte fonte, ArmazenamentoInterno ssd, boolean funcionando) {
        this.cpu = cpu;
        this.ram = ram;
        this.fonte = fonte;
        this.ssd = ssd;
        this.funcionando = funcionando;
    }
    public void ligar(){
        
    }
    
}
