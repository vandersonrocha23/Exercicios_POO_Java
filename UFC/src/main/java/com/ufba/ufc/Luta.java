/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.ufc;

import java.util.Random;

/**
 *
 * @author vande
 */
public class Luta {
    private  Lutador desafiado;
    private  Lutador desafiando;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1!=l2 ) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiando = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiando = null;
        }
        
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiando.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0,1,2
            System.out.println("=========RESULTADO DA LUTA=========");
            switch(vencedor){
                case 0 -> {
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiando.empatarLuta();
                }
                case 1 -> {
                    System.out.println("Vitoria do "+ this.desafiado);
                    this.desafiado.ganharLuta();
                    this.desafiando.perderLuta();
                }
                case 2 -> {
                    System.out.println("Vitoria do " + this.desafiando);
                    this.desafiado.perderLuta();
                    this.desafiando.ganharLuta();
                }
            }
            System.out.println("=====================================");
            
        }else {
            System.out.println("A LUTA NAO PODE ACONTECER!");
        }
    }
    public Lutador getDesafiado(){
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    public Lutador getDesafiando(){
        return desafiando;
    }
    public void setDesafiando(Lutador desafiando){
        this.desafiando = desafiando;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
