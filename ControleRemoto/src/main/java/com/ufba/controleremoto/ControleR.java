/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.controleremoto;

/**
 *
 * @author vande
 */
public class ControleR implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //metodos especiais
    public  ControleR(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private int getVolume(){
        return volume;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }
    private boolean getLigado(){
        return ligado;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private boolean getTocando(){
        return tocando;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    //Metodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Esta ligado?"+this.getLigado());
        System.out.println("Esta tocando?" +this.getTocando());
        System.out.println("Volume: "+ this.getVolume());
        for (int i = 0; i<= this.getVolume(); i+=10){
            System.out.println("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()+50);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()-50);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado()&& !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
    
}
