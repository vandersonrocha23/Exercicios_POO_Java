/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.simulacaoprova;

/**
 *
 * @author vande
 */
public class Prato {
    private int nmrPrato;
    private String nomePrato;
    private float valor;
    private String tipoPrato;

    public Prato(int nmrPrato, String nomePrato, float valor, String tipoPrato) {
        this.nmrPrato = nmrPrato;
        this.nomePrato = nomePrato;
        this.valor = valor;
        this.tipoPrato = tipoPrato;
    }

    public Prato(int nmrPrato, String nomePrato, float valor) {
        this.nmrPrato = nmrPrato;
        this.nomePrato = nomePrato;
        this.valor = valor;
        this.tipoPrato = "prato principal";
    }

    public int getNmrPrato() {
        return nmrPrato;
    }

    public void setNmrPrato(int nmrPrato) {
        this.nmrPrato = nmrPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipoPrato() {
        return tipoPrato;
    }

    public void setTipoPrato(String tipoPrato) {
        this.tipoPrato = tipoPrato;
    }
    public String toString(){
        return "Prato: "+nomePrato+" | Valor: "+ valor + "| Tipo: "+ tipoPrato;
    }
    
}
